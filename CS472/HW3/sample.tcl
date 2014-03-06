# Step 0.  Global setup
# - Create a reference to the simulator class
set ns [new Simulator]

# - Create the output file
set outputfile [open out.tr w]
$ns trace-all $outputfile

# - Open a file to write the nam-trace to 
set namfile [open out.nam w]
$ns namtrace-all $namfile

# Step 1.  Create the topology
# - Create four nodes
set n0 [$ns node]
set n1 [$ns node]
set n2 [$ns node]
set n3 [$ns node]
set n4 [$ns node]
set n5 [$ns node]

# - Create links
$ns duplex-link $n0 $n2 10mb 10ms DropTail
$ns duplex-link $n1 $n2 10mb 10ms DropTail
$ns duplex-link $n2 $n3 10mb 10ms DropTail
$ns duplex-link $n3 $n4 10mb 10ms DropTail
$ns duplex-link $n3 $n5 10mb 10ms DropTail

# - Create layout for nam
$ns duplex-link-op $n0 $n2 orient right-down
$ns duplex-link-op $n1 $n2 orient right-up
$ns duplex-link-op $n2 $n3 orient right
$ns duplex-link-op $n3 $n4 orient right-up
$ns duplex-link-op $n3 $n5 orient right-down

# Step 2.  Establish a UDP flow between node 1 and node 4 
# - Create UDP source agent and attach it to node 1
set udp0 [new Agent/UDP]
$ns attach-agent $n1 $udp0
# - And color it RED for readability
$udp0 set class_ 1
$ns color 1 Red

# - Create UDP source agent and attach it to node 2
set udp1 [new Agent/UDP]
$ns attach-agent $n2 $udp1
# - And color it RED for readability
$udp1 set class_ 1
$ns color 1 Red

# - Create a UDP "sink" agent and attach it to node 4
set null0 [new Agent/Null]
$ns attach-agent $n4 $null0

# - Create the "flow" between them
$ns connect $udp0 $null0
$ns connect $udp1 $null0

# - Create some UDP traffic (CBR) and attach it to the UDP flow
set cbr0 [new Application/Traffic/CBR]
$cbr0 set packetSize_ 1024
$cbr0 set interval_ 0.005
$cbr0 attach-agent $udp0

# - Create some UDP traffic (CBR) and attach it to the UDP flow
set cbr1 [new Application/Traffic/CBR]
$cbr1 set packetSize_ 1024
$cbr1 set interval_ 0.005
$cbr1 attach-agent $udp1


# Step 3. - Create a TCP connection
# - Create the connection between node 0 and node 5
set tcp1 [$ns create-connection TCP $n0 TCPSink $n5 42]
$tcp1 set window_ 32
# - And color it BLUE for readability
$tcp1 set class_ 2
$ns color 2 Blue

# - Create the connection between node 0 and node 3
set tcp2 [$ns create-connection TCP $n3 TCPSink $n5 42]
$tcp2 set window_ 32
# - And color it BLUE for readability
$tcp2 set class_ 2
$ns color 2 Blue

# - Create a TCP application (FTP) and connect it to the TCP connection
set ftp1 [new Application/FTP]
$ftp1 attach-agent $tcp1
set ftp2 [new Application/FTP]
$ftp2 attach-agent $tcp2

# Step 4. - Any specifications for start/stop
$ns at 0.0 "$ftp1 start"
$ns at 0.0 "$ftp2 start"
$ns at 0.0 "$cbr0 start"
$ns at 0.0 "$cbr1 start"

# Step 5. - Finish processing procedure
# - Flush all files and start NAM
proc finish {} {
	global ns namfile outputfile
	$ns flush-trace
	close $namfile
	close $outputfile
	puts "running nam.... "
	exec nam out.nam &
	exit 0
}

# Step 6 - End execution at 60 seconds
$ns at 60.0 "finish"

# Step 7 - HIT IT.
$ns run

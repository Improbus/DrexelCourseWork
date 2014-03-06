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
$ns duplex-link $n0 $n1 1mb 10ms DropTail
$ns duplex-link $n2 $n3 1mb 10ms DropTail
$ns duplex-link $n1 $n4 1mb 10ms DropTail
$ns duplex-link $n3 $n4 1mb 10ms DropTail
$ns duplex-link $n4 $n5 1mb 10ms DropTail

# - Create layout for nam
$ns duplex-link-op $n0 $n1 orient right
$ns duplex-link-op $n2 $n3 orient right
$ns duplex-link-op $n1 $n4 orient right-down
$ns duplex-link-op $n3 $n4 orient right-up
$ns duplex-link-op $n4 $n5 orient right

# Step 2.  Establish a UDP flow between node 0 and node 5 
# - Create UDP source agent and attach it to node 0
set udp0 [new Agent/UDP]
$ns attach-agent $n0 $udp0
# - And color it RED for readability
$udp0 set class_ 1
$ns color 1 Red

# - Create UDP source agent and attach it to node 3
set udp1 [new Agent/UDP]
$ns attach-agent $n3 $udp1
# - And color it RED for readability
$udp1 set class_ 1
$ns color 1 Red

# - Create a UDP "sink" agent and attach it to node 5
set null0 [new Agent/Null]
$ns attach-agent $n5 $null0

# - Create the "flow" between them
$ns connect $udp0 $null0
$ns connect $udp1 $null0

# - Create some UDP traffic (CBR) and attach it to the UDP flow
set cbr0 [new Application/Traffic/CBR]
$cbr0 set packetSize_ 512
$cbr0 set interval_ 0.005
$cbr0 attach-agent $udp0

# - Create some UDP traffic (CBR) and attach it to the UDP flow
set cbr1 [new Application/Traffic/CBR]
$cbr1 set packetSize_ 512
$cbr1 set interval_ 0.005
$cbr1 attach-agent $udp1


# Step 3. - Create a TCP connection
# - TAHOE Create the connection between node 2 and node 5
set tcp1 [$ns create-connection TCP $n2 TCPSink $n5 32]
$tcp1 set window_ 100
$tcp1 set packetsize_ 1
$tcp1 set windowOption_ 1
$tcp1 set overhead 0
$tcp1 set minrto_ 0.2
$tcp1 set interval_ 0.005
# - And color it BLUE for readability
$tcp1 set class_ 2
$ns color 2 Blue

# - Create a TCP application (FTP) and connect it to the TCP connection
set ftp1 [new Application/FTP]
$ftp1 attach-agent $tcp1

# Step 4. - Any specifications for start/stop
$ns at 0.0 "$ftp1 start"
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

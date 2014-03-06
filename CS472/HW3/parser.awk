#this file parses the trace file and measures the throughput of udp flow at the destination
# You are required to add code to it so that it also measures the goodput of tcp flow and tcp/udp bytes ratio

BEGIN {udppkts_sent=0; udppkts_rcvd=0; tcppkts_sent=0; tcppkts_rcvd=0; tcpbytes_total=0; udpbytes_total=0; tcptime=60; udptime=60;}  #initialize
 
$1=="+" && ( $3=="0" || $3=="3" ) && $5 == "cbr" {udppkts_sent++;}    #if packet is sent from node 0 or 3, increment the total number of packets sent
$1=="r" && $4=="5" && $5 == "cbr" {udppkts_rcvd++;}  #if packet is received at node 5, increment the total number of packets received
$1=="+" && $3=="2" && $5 == "tcp" {tcppkts_sent++;}  
$1=="r" && $4=="5" && $5 == "tcp" {tcppkts_rcvd++;} 
$1=="r" && $4=="5" && $5=="tcp" {tcpbytes_total+=$6;}
$1=="r" && $4=="5" && $5=="cbr" {udpbytes_total+=$6;}

# At the end of parsing, calculate the throughput and write it to hw3.log file
END {   
	udp_thru = udppkts_rcvd / udppkts_sent * 100;
	print "UDP Throughput" >> "hw3.log"
	print udp_thru >> "hw3.log"
	print "UDP Bytes Received" >> "hw3.log"
	print udpbytes_total >> "hw3.log"
	print "UDP Goodput" >> "hw3.log"
	print (udpbytes_total/udptime) >> "hw3.log"
	tcp_thru = tcppkts_rcvd / tcppkts_sent * 100;
	print "TCP Throughput" >> "hw3.log"
	print tcp_thru >> "hw3.log"
	print "TCP Bytes Received" >> "hw3.log"
	print tcpbytes_total >> "hw3.log"
	print "TCP Goodput" >> "hw3.log"
	print (tcpbytes_total/tcptime) >> "hw3.log"
	print "TCP/UDP Ratio" >> "hw3.log"
	print tcpbytes_total/udpbytes_total >> "hw3.log"
	print "UDP/TCP Ratio" >> "hw3.log"
	print udpbytes_total/tcpbytes_total >> "hw3.log"
    }

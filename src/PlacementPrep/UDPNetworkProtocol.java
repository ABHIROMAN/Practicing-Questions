package PlacementPrep;

import java.util.List;

//class UDPNetworkProtocol {
//    public static long getNumberofDroppedPackets(List<List<Integer>> requests, int max_packets, int rate) {
//        long droppedPackets = 0;
//        int pipelineSize = 0;
//
//        for (List<Integer> request : requests) {
//            int time = request.get(0);
//            int numPackets = request.get(1);
//
//            int packetsDelivered = Math.min(pipelineSize, rate * time);
//            pipelineSize -= packetsDelivered;
//
//            pipelineSize += numPackets;
//
//            if (pipelineSize > max_packets) {
//                int excessPackets = pipelineSize - max_packets;
//                droppedPackets += excessPackets;
//                pipelineSize = max_packets;
//            }
//        }
//
//        return droppedPackets;
//    }
//}
import java.util.*;

public class  UDPNetworkProtocol {

    public static long getNumberDroppedPackets(List<List<Integer>> requests, int maxPackets, int rate) {
        // Create a queue to store the packets.
        Queue<Integer> queue = new LinkedList<>();

        // Iterate over the requests array.
        for (List<Integer> request : requests) {
            // Get the number of packets to send at this time.
            int numPackets = request.get(0);

            // Add the packets to the queue.
            for (int i = 0; i < numPackets; i++) {
                queue.add(request.get(1));
            }

            // Remove the packets from the queue at the rate of rate per second.
            while (queue.size() > maxPackets) {
                queue.remove();
            }
        }

        // Return the number of packets that are dropped.
        return queue.size();
    }
}
package vn.razin.proto;


import vn.razin.proto.core.protobuf.ProtocInvoker;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ProtocInvoker.ProtocInvocationException {
        String path ="d:\\atomyze\\proto_16092021\\";
        //System.out.println("PROTO_FOLDER = " + args[1] + "\n");
        //System.out.println("LIB_FOLDER = " + args[2] + "\n");
        ProtocInvoker.forConfig(path + "\\atmz\\", "d:\\atomyze\\googleapis-master\\").invoke();
        SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
        System.out.println("Сформированный бинарник для GRPC request sampler " + System.getProperty("user.dir") + File.separator + "compileProto" + dateFormat.format(new Date()) + ".pb.bin" + "\n");
    }
}

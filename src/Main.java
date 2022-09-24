import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args){
        Animal example = new Animal();

        System.out.println(example.getName());
        example.setName("Gerald");
        System.out.println(example.getName()); 
    }
}

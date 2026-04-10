package com.flamystic.boombeach;

import d.d;
import d.e;
import e.c;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class a {
   private static Properties c;
   private static ServerSocket d;
   private static List e;
   public final byte[] a = new byte[256];
   public final byte[] b = new byte[256];
   private int f = 0;
   private int g = 0;

   public static void a() {
      System.out.println("Loading the configuration!");
      c = j();
   }

   private static Properties j() {
      while(true) {
         Properties var0 = new Properties();
         File var1;
         if ((var1 = new File("config.flamystic")).exists()) {
            FileInputStream var3 = new FileInputStream(var1);
            var0.load(var3);
            return var0;
         }

         System.out.println("Configuration not found, creating the default one...");
         Properties var2;
         (var2 = new Properties()).put("username", "Commander");
         var2.put("patchingServer", "");
         var2.put("diamonds", "1000000000");
         var2.put("wood", "1000000000");
         var2.put("stone", "1000000000");
         var2.put("gold", "1000000000");
         var2.put("iron", "1000000000");
         var2.put("victoryPoints", "1000000000");
         var2.put("obstacles", "false");
         var2.put("headquarterLevel", "20");
         var2.store(new FileOutputStream(var1), "This is the default file, created by the Flamystic emulator.");
      }
   }

   public static int b() {
      return a("diamonds");
   }

   private static int a(String var0) {
      return Integer.valueOf(c.getProperty(var0));
   }

   public static String c() {
      String var0 = "username";
      return c.getProperty(var0);
   }

   public static int d() {
      return a("wood");
   }

   public static int e() {
      return a("gold");
   }

   public static int f() {
      return a("victoryPoints");
   }

   public static boolean g() {
      String var0 = "obstacles";
      var0 = "obstacles";
      return Boolean.valueOf(c.getProperty(var0));
   }

   public static int h() {
      return a("headquarterLevel");
   }

   public static void a(b.b var0) {
      String var10001;
      if ((new File(var0.a() + ".village")).exists()) {
         System.out.println("Player " + var0.a() + " has already signed up.");
         var10001 = b(var0.a() + ".village");
      } else {
         var10001 = "{\"buildings\":[{\"data\":1000000,\"lvl\":0,\"x\":38,\"y\":33},{\"data\":1000001,\"lvl\":0,\"x\":35,\"y\":38,\"res_time\":6090},{\"data\":1000002,\"lvl\":0,\"x\":32,\"y\":32,\"res_time\":0},{\"data\":1000017,\"lvl\":0,\"x\":52,\"y\":32,\"units\":[[4000000,5]],\"storage_type\":0,\"boat_index\":0,\"last_unit\":4000000,\"unit_prod\":{\"total_time\":5}},{\"data\":1000015,\"lvl\":0,\"x\":58,\"y\":38},{\"data\":1000020,\"lvl\":0,\"x\":36,\"y\":42},{\"data\":1000017,\"lvl\":0,\"x\":52,\"y\":29,\"units\":[[4000000,5]],\"storage_type\":0,\"boat_index\":1,\"last_unit\":4000000,\"unit_prod\":{\"total_time\":5}},{\"data\":1000010,\"lvl\":0,\"x\":31,\"y\":39}],\"obstacles\":[{\"data\":8000005,\"x\":23,\"y\":5},{\"data\":8000005,\"x\":4,\"y\":21},{\"data\":8000005,\"x\":34,\"y\":5},{\"data\":8000005,\"x\":8,\"y\":29},{\"data\":8000005,\"x\":28,\"y\":9},{\"data\":8000005,\"x\":6,\"y\":14},{\"data\":8000005,\"x\":12,\"y\":8},{\"data\":8000005,\"x\":19,\"y\":20},{\"data\":8000005,\"x\":17,\"y\":13},{\"data\":8000005,\"x\":42,\"y\":20},{\"data\":8000004,\"x\":14,\"y\":25},{\"data\":8000004,\"x\":13,\"y\":35},{\"data\":8000004,\"x\":35,\"y\":18},{\"data\":8000004,\"x\":43,\"y\":14},{\"data\":8000004,\"x\":35,\"y\":27},{\"data\":8000004,\"x\":15,\"y\":41},{\"data\":8000004,\"x\":28,\"y\":21},{\"data\":8000000,\"x\":47,\"y\":34},{\"data\":8000004,\"x\":7,\"y\":38},{\"data\":8000004,\"x\":45,\"y\":20},{\"data\":8000004,\"x\":47,\"y\":36},{\"data\":8000004,\"x\":20,\"y\":31},{\"data\":8000003,\"x\":9,\"y\":11},{\"data\":8000003,\"x\":15,\"y\":5},{\"data\":8000003,\"x\":19,\"y\":5},{\"data\":8000003,\"x\":26,\"y\":5},{\"data\":8000003,\"x\":30,\"y\":5},{\"data\":8000003,\"x\":37,\"y\":5},{\"data\":8000003,\"x\":9,\"y\":15},{\"data\":8000003,\"x\":13,\"y\":11},{\"data\":8000003,\"x\":17,\"y\":9},{\"data\":8000003,\"x\":4,\"y\":17},{\"data\":8000003,\"x\":4,\"y\":24},{\"data\":8000003,\"x\":8,\"y\":19},{\"data\":8000003,\"x\":13,\"y\":15},{\"data\":8000003,\"x\":24,\"y\":9},{\"data\":8000003,\"x\":41,\"y\":6},{\"data\":8000003,\"x\":45,\"y\":9},{\"data\":8000003,\"x\":45,\"y\":13},{\"data\":8000003,\"x\":31,\"y\":9},{\"data\":8000003,\"x\":35,\"y\":9},{\"data\":8000003,\"x\":39,\"y\":10},{\"data\":8000003,\"x\":18,\"y\":16},{\"data\":8000008,\"x\":21,\"y\":10},{\"data\":8000008,\"x\":28,\"y\":12},{\"data\":8000008,\"x\":4,\"y\":30},{\"data\":8000008,\"x\":20,\"y\":13},{\"data\":8000008,\"x\":8,\"y\":23},{\"data\":8000008,\"x\":22,\"y\":21},{\"data\":8000007,\"x\":4,\"y\":28},{\"data\":8000007,\"x\":6,\"y\":28},{\"data\":8000002,\"x\":7,\"y\":34},{\"data\":8000002,\"x\":12,\"y\":19},{\"data\":8000002,\"x\":23,\"y\":13},{\"data\":8000002,\"x\":31,\"y\":13},{\"data\":8000002,\"x\":35,\"y\":13},{\"data\":8000002,\"x\":39,\"y\":14},{\"data\":8000002,\"x\":45,\"y\":22},{\"data\":8000002,\"x\":37,\"y\":18},{\"data\":8000002,\"x\":22,\"y\":17},{\"data\":8000007,\"x\":43,\"y\":16},{\"data\":8000008,\"x\":41,\"y\":18},{\"data\":8000008,\"x\":46,\"y\":17},{\"data\":8000007,\"x\":44,\"y\":18},{\"data\":8000007,\"x\":47,\"y\":20},{\"data\":8000007,\"x\":16,\"y\":19},{\"data\":8000007,\"x\":11,\"y\":37},{\"data\":8000007,\"x\":13,\"y\":41},{\"data\":8000008,\"x\":14,\"y\":38},{\"data\":8000008,\"x\":9,\"y\":32},{\"data\":8000008,\"x\":8,\"y\":26},{\"data\":8000008,\"x\":11,\"y\":23},{\"data\":8000008,\"x\":16,\"y\":21},{\"data\":8000008,\"x\":42,\"y\":22},{\"data\":8000002,\"x\":27,\"y\":14},{\"data\":8000002,\"x\":31,\"y\":17},{\"data\":8000002,\"x\":11,\"y\":28},{\"data\":8000007,\"x\":12,\"y\":26},{\"data\":8000007,\"x\":14,\"y\":23},{\"data\":8000008,\"x\":12,\"y\":32},{\"data\":8000008,\"x\":26,\"y\":18},{\"data\":8000001,\"x\":15,\"y\":35},{\"data\":8000001,\"x\":15,\"y\":27},{\"data\":8000001,\"x\":16,\"y\":24},{\"data\":8000001,\"x\":25,\"y\":21},{\"data\":8000001,\"x\":19,\"y\":24},{\"data\":8000001,\"x\":30,\"y\":21},{\"data\":8000001,\"x\":46,\"y\":26},{\"data\":8000001,\"x\":34,\"y\":21},{\"data\":8000001,\"x\":37,\"y\":22},{\"data\":8000001,\"x\":16,\"y\":31},{\"data\":8000001,\"x\":19,\"y\":28},{\"data\":8000001,\"x\":23,\"y\":25},{\"data\":8000001,\"x\":26,\"y\":24},{\"data\":8000001,\"x\":40,\"y\":24},{\"data\":8000000,\"x\":16,\"y\":43},{\"data\":8000000,\"x\":18,\"y\":34},{\"data\":8000000,\"x\":23,\"y\":29},{\"data\":8000000,\"x\":30,\"y\":25},{\"data\":8000000,\"x\":34,\"y\":24},{\"data\":8000000,\"x\":37,\"y\":26},{\"data\":8000000,\"x\":43,\"y\":27},{\"data\":8000000,\"x\":47,\"y\":30},{\"data\":8000000,\"x\":39,\"y\":28},{\"data\":8000000,\"x\":27,\"y\":29},{\"data\":8000000,\"x\":22,\"y\":35},{\"data\":8000000,\"x\":33,\"y\":28},{\"data\":8000006,\"x\":44,\"y\":31},{\"data\":8000006,\"x\":25,\"y\":33},{\"data\":8000006,\"x\":29,\"y\":27},{\"data\":8000006,\"x\":33,\"y\":26},{\"data\":8000006,\"x\":36,\"y\":30},{\"data\":8000006,\"x\":18,\"y\":39},{\"data\":8000006,\"x\":41,\"y\":29},{\"data\":8000007,\"x\":4,\"y\":35}],\"traps\":[],\"decos\":[],\"resource_ships\":[{\"data\":35000000,\"resource\":3000001,\"count\":7,\"cap\":760,\"rewardtype\":0,\"level\":0,\"coop\":0,\"x\":66,\"y\":42}],\"secondsFromLastTreeRespawn\":1231,\"map_spawn_timer\":34527,\"deepsea_spawn_timer\":77763,\"map_unliberation_timer\":4459,\"upgrade_outpost_defenses\":false,\"seed\":0}";
      }

      var0.b(var10001);
   }

   public static void a(a.a var0) {
      b.b var1 = var0.c();
      FileOutputStream var2;
      (var2 = new FileOutputStream(var0.c().a() + ".village")).write(var1.d().a().getBytes());
      var2.close();
   }

   private static String b(String var0) {
      BufferedReader var3 = new BufferedReader(new FileReader(var0));
      StringBuffer var1 = new StringBuffer();

      String var2;
      while((var2 = var3.readLine()) != null) {
         var1.append(var2).append("\n");
      }

      var3.close();
      return var1.toString();
   }

   public static void i() {
      d = new ServerSocket(9339);
      e = new ArrayList();
      (new Thread(() -> {
         try {
            while(com.flamystic.boombeach.b.a) {
               Socket var0 = d.accept();
               System.out.println("New client! (" + var0.getInetAddress().toString() + ")");
               e.add(new a.a(var0));
            }

         } catch (Exception var1) {
            var1.printStackTrace();
         }
      })).start();
   }

   public static void b(a.a var0) {
      e.remove(var0);
   }

   public a(byte[] var1) {
      int var2;
      for(var2 = 0; var2 < 256; ++var2) {
         this.b[var2] = (byte)var2;
      }

      var2 = 0;

      for(int var4 = 0; var4 < 256; ++var4) {
         var2 = var2 + this.b[var4] + var1[var4 % var1.length] & 255;
         byte var3 = this.b[var2];
         this.b[var2] = this.b[var4];
         this.b[var4] = var3;
      }

      this.a(var1.length);
   }

   public byte[] a(byte[] var1) {
      for(int var2 = 0; var2 < 256; ++var2) {
         this.a[var2] = this.b[var2];
      }

      byte[] var5 = new byte[var1.length];

      for(int var4 = 0; var4 < var1.length; ++var4) {
         this.f = this.f + 1 & 255;
         this.g = this.g + this.b[this.f] & 255;
         byte var3 = this.b[this.g];
         this.b[this.g] = this.b[this.f];
         this.b[this.f] = var3;
         var3 = this.b[this.b[this.f] + this.b[this.g] & 255];
         var5[var4] = (byte)(var1[var4] ^ var3);
      }

      return var5;
   }

   public byte[] a(int var1) {
      byte[] var2 = new byte[var1];
      return this.a(var2);
   }

   public static e a(d var0, Object... var1) {
      if (var0 == d.d.e) {
         return new c((b.b)var1[0]);
      } else if (var0 == d.d.c) {
         return new e.a();
      } else if (var0 == d.d.h) {
         return new f.a();
      } else {
         return var0 == d.d.f ? new f.c((b.b)var1[0]) : null;
      }
   }
}

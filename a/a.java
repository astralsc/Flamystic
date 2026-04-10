package a;

import b.b;
import d.c;
import d.d;
import d.e;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public final class a {
   private Socket a;
   private OutputStream b;
   private InputStream c;
   private com.flamystic.boombeach.a d;
   private com.flamystic.boombeach.a e;
   private b f;
   // $FF: synthetic field
   private static int[] g;

   public a(Socket var1) {
      this.a = var1;
      this.b = this.a.getOutputStream();
      this.c = this.a.getInputStream();
      this.f = new b();
      this.d = new com.flamystic.boombeach.a("fhsd6f86f67rt8fw78fw789we78r9789wer6renonce".getBytes());
      this.e = new com.flamystic.boombeach.a("fhsd6f86f67rt8fw78fw789we78r9789wer6renonce".getBytes());
      (new Thread(() -> {
         a var1 = this;

         try {
            a var2 = var1;

            while(true) {
               while(var2.c.available() < 7) {
               }

               byte[] var3 = new byte[7];
               var2.c.read(var3, 0, 7);
               c.a var4;
               (var4 = new c.a(new ByteArrayInputStream(var3))).readShort();
               int var6 = var4.read();
               int var7 = var4.read();
               int var5 = var4.read();
               var5 = (var6 & 255) << 16 | (var7 & 255) << 8 | var5 & 255;
               var4.readShort();
               var4.close();
               byte[] var10 = new byte[var5];

               while(var2.c.available() < var5) {
               }

               var2.c.read(var10, 0, var5);
               d.a var11;
               (var11 = new d.a()).a(var3, var10);
               var2.a((d.b)var11);
            }
         } catch (Exception var9) {
            System.out.println("Error! Disconnecting the player");
            com.flamystic.boombeach.a.b(this);

            try {
               var1.b.close();
               var1.c.close();
            } catch (IOException var8) {
               var8.printStackTrace();
            }

            var9.printStackTrace();
         }
      })).start();
   }

   private void a(d.b var1) {
      var1.a(this);
      switch(d()[var1.b().ordinal()]) {
      case 1:
         e.b var7;
         (var7 = new e.b(var1)).e();
         b var8 = this.f;
         var8.a(var7.f());
         var8.a(var7.g());
         System.out.println("Client " + this.f.a() + " (" + this.f.b() + ") tries to log in!");
         com.flamystic.boombeach.a.a(this.f);
         this.a(com.flamystic.boombeach.a.a(d.d.e, this.f));
         this.a(com.flamystic.boombeach.a.a(d.d.f, this.f));
         return;
      case 7:
         this.a(com.flamystic.boombeach.a.a(d.d.h));
         return;
      case 9:
         f.b var5;
         (var5 = new f.b(var1)).e();
         if (var5.f() != null) {
            c[] var4;
            int var3 = (var4 = var5.f()).length;

            for(int var2 = 0; var2 < var3; ++var2) {
               c var6;
               if ((var6 = var4[var2]) != null) {
                  if (var6.a() == 500) {
                     this.f.d().a(var6.b());
                     com.flamystic.boombeach.a.a(this);
                  } else if (var6.a() == 502) {
                     this.f.d().b(var6.b());
                     com.flamystic.boombeach.a.a(this);
                  } else if (var6.a() == 501) {
                     this.f.d().c(var6.b());
                     com.flamystic.boombeach.a.a(this);
                  }
               }
            }

            return;
         }
         break;
      case 12:
         this.a(com.flamystic.boombeach.a.a(d.d.f, this.f));
         return;
      default:
         System.out.printf("Unknown Packet received (%s)\n", var1.b().a());
      }

   }

   private void a(e var1) {
      var1.a();
      var1.a(this);
      var1.b();
      this.b.write(var1.c());
      this.b.flush();
   }

   public final com.flamystic.boombeach.a a() {
      return this.d;
   }

   public final com.flamystic.boombeach.a b() {
      return this.e;
   }

   public final b c() {
      return this.f;
   }

   // $FF: synthetic method
   private static int[] d() {
      int[] var10000 = g;
      if (var10000 != null) {
         return var10000;
      } else {
         int[] var0 = new int[d.d.values().length];

         try {
            var0[d.d.h.ordinal()] = 8;
         } catch (NoSuchFieldError var12) {
         }

         try {
            var0[d.d.c.ordinal()] = 3;
         } catch (NoSuchFieldError var11) {
         }

         try {
            var0[d.d.i.ordinal()] = 9;
         } catch (NoSuchFieldError var10) {
         }

         try {
            var0[d.d.l.ordinal()] = 12;
         } catch (NoSuchFieldError var9) {
         }

         try {
            var0[d.d.f.ordinal()] = 6;
         } catch (NoSuchFieldError var8) {
         }

         try {
            var0[d.d.g.ordinal()] = 7;
         } catch (NoSuchFieldError var7) {
         }

         try {
            var0[d.d.a.ordinal()] = 1;
         } catch (NoSuchFieldError var6) {
         }

         try {
            var0[d.d.d.ordinal()] = 4;
         } catch (NoSuchFieldError var5) {
         }

         try {
            var0[d.d.e.ordinal()] = 5;
         } catch (NoSuchFieldError var4) {
         }

         try {
            var0[d.d.j.ordinal()] = 10;
         } catch (NoSuchFieldError var3) {
         }

         try {
            var0[d.d.k.ordinal()] = 11;
         } catch (NoSuchFieldError var2) {
         }

         try {
            var0[d.d.b.ordinal()] = 2;
         } catch (NoSuchFieldError var1) {
         }

         g = var0;
         return var0;
      }
   }
}

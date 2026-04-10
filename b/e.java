package b;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class e {
   private g.c a;
   private List b;
   private List c;
   private List d;
   private int e;
   private int f;
   private int g;
   private int h;
   private int i;
   private boolean j;
   private String k;

   public final String a() {
      g.c var1;
      (var1 = new g.c()).a("name", (Object)null);
      g.a var2 = new g.a();
      Iterator var4 = this.b.iterator();

      while(var4.hasNext()) {
         a var3 = (a)var4.next();
         var2.a(var3.a());
      }

      var1.a("buildings", (Object)var2);
      g.a var6 = new g.a();
      Iterator var5 = this.c.iterator();

      while(var5.hasNext()) {
         a var9 = (a)var5.next();
         var6.a(var9.a());
      }

      var1.a("obstacles", (Object)var6);
      g.a var10 = new g.a();
      var2 = new g.a();
      var1.a("traps", (Object)var10);
      var1.a("decos", (Object)var2);
      var2 = new g.a();
      var4 = this.d.iterator();

      while(var4.hasNext()) {
         c var7 = (c)var4.next();
         var2.a(var7.a());
      }

      var1.a("resource_ships", (Object)var2);
      var1.a((String)"secondsFromLastTreeRespawn", 0);
      var1.a((String)"map_spawn_timer", 0);
      var1.a((String)"deepsea_spawn_timer", 0);
      var1.a((String)"seed", 0);
      boolean var11 = false;
      String var8 = "upgrade_outpost_defenses";
      var1.a(var8, (Object)(var11 ? Boolean.TRUE : Boolean.FALSE));
      var1.a((String)"map_unliberation_timer", 0);
      this.k = var1.toString();
      this.a = var1;
      return this.k;
   }

   public final e a(String var1) {
      this.a = null;
      this.b = new ArrayList();
      this.c = new ArrayList();
      this.d = new ArrayList();
      this.e = 0;
      this.f = 0;
      this.g = 0;
      this.h = 0;
      this.j = false;
      this.i = 0;
      this.k = "";
      this.k = var1;
      this.a = new g.c(var1);
      g.a var3 = this.a.c("buildings");

      for(int var2 = 0; var2 < var3.a(); ++var2) {
         this.b.add((new a()).a(var3.c(var2)));
      }

      int var4;
      g.a var5;
      if (com.flamystic.boombeach.a.g()) {
         var5 = this.a.c("obstacles");

         for(var4 = 0; var4 < var5.a(); ++var4) {
            this.c.add((new a()).a(var5.c(var4)));
         }
      }

      var5 = this.a.c("resource_ships");

      for(var4 = 0; var4 < var5.a(); ++var4) {
         this.d.add((new c()).a(var5.c(var4)));
      }

      return this;
   }

   public final void a(byte[] var1) {
      c.a var5;
      int var2 = (var5 = new c.a(new ByteArrayInputStream(var1))).readInt();
      int var3 = var5.readInt();
      int var4 = var5.readInt();
      this.b.add(new a(var2, var3, var4, 0));
      this.a();
      var5.readInt();
      var5.close();
   }

   public final void b(byte[] var1) {
      c.a var5;
      int var2 = (var5 = new c.a(new ByteArrayInputStream(var1))).readInt();

      for(int var3 = 0; var3 < this.b.size(); ++var3) {
         a var4 = (a)this.b.get(var3);
         if (this.a(var4, true) == var2) {
            var4.b();
            this.b.set(var3, var4);
            break;
         }
      }

      this.a();
      var5.readInt();
      var5.close();
   }

   public final void c(byte[] var1) {
      c.a var7;
      int var2 = (var7 = new c.a(new ByteArrayInputStream(var1))).readInt();
      int var3 = var7.readInt();
      int var4 = var7.readInt();

      for(int var5 = 0; var5 < this.b.size(); ++var5) {
         a var6 = (a)this.b.get(var5);
         if (this.a(var6, true) == var4) {
            var6.a(var2);
            var6.b(var3);
            this.b.set(var5, var6);
            break;
         }
      }

      this.a();
      var7.readInt();
      var7.close();
   }

   private int a(a var1, boolean var2) {
      return 500000000 + this.b.indexOf(var1);
   }
}

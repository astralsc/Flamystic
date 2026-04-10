package d;

public enum d {
   a(10101),
   b(0),
   c(20000),
   d(20103),
   e(20104),
   f(24101),
   g(10108),
   h(20108),
   i(14102),
   j(14165),
   k(24133),
   l(14101);

   private short m;

   private d(int var3) {
      this.m = (short)var3;
   }

   public final short a() {
      return this.m;
   }

   public static d a(short var0) {
      d[] var4;
      int var3 = (var4 = values()).length;

      for(int var2 = 0; var2 < var3; ++var2) {
         d var1;
         if ((var1 = var4[var2]).m == var0) {
            return var1;
         }
      }

      return b;
   }

   public final void b(short var1) {
      this.m = var1;
   }
}

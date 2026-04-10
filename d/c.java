package d;

import java.util.Arrays;

public final class c {
   private int a;
   private byte[] b;

   public final int a() {
      return this.a;
   }

   public final void a(int var1) {
      this.a = var1;
   }

   public final byte[] b() {
      return this.b;
   }

   public final void a(byte[] var1) {
      this.b = var1;
   }

   public final String toString() {
      return "Command ID = " + this.a + "\nPayload = " + Arrays.toString(this.b);
   }
}

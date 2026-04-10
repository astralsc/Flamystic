package c;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.Deflater;
import javax.xml.bind.DatatypeConverter;

public final class b extends DataOutputStream {
   public b(OutputStream var1) {
      super(var1);
   }

   public final void a(String var1) {
      if (var1 != null) {
         this.a(var1.getBytes(StandardCharsets.UTF_8));
      } else {
         this.writeInt(-1);
      }
   }

   public final void a(byte[] var1) {
      if (var1 == null) {
         this.writeInt(-1);
      } else {
         this.writeInt(var1.length);
         byte[] var4 = var1;
         int var3 = var1.length;

         for(int var2 = 0; var2 < var3; ++var2) {
            byte var5 = var4[var2];
            this.write(var5);
         }

      }
   }

   public final void a() {
      this.a((String)null);
   }

   public final void b(String var1) {
      this.writeBoolean(true);
      Deflater var2;
      (var2 = new Deflater()).setInput(var1.getBytes());
      var2.finish();
      ByteArrayOutputStream var3 = new ByteArrayOutputStream(var1.getBytes().length);
      byte[] var4 = new byte[1024];

      while(!var2.finished()) {
         int var5 = var2.deflate(var4);
         var3.write(var4, 0, var5);
      }

      var3.close();
      byte[] var7 = var3.toByteArray();
      this.writeInt(var7.length + 4);
      int var6 = var1.getBytes().length;
      this.writeByte(var6 & 255);
      this.writeByte(var6 >> 8 & 255);
      this.writeByte(var6 >> 16 & 255);
      this.writeByte(var6 >>> 24);
      this.write(var7);
   }

   public final void c(String var1) {
      this.write(DatatypeConverter.parseHexBinary(var1));
   }
}

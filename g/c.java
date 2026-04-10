package g;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class c {
   private final Map b;
   public static final Object a = new d((byte)0);

   public c() {
      this.b = new LinkedHashMap();
   }

   public c(f var1) {
      this();
      if (var1.b() != '{') {
         throw var1.a("A JSONObject text must begin with '{'");
      } else {
         while(true) {
            switch(var1.b()) {
            case '\u0000':
               throw var1.a("A JSONObject text must end with '}'");
            case '}':
               return;
            default:
               var1.a();
               String var3 = var1.c().toString();
               if (var1.b() != ':') {
                  throw var1.a("Expected a ':' after a key");
               }

               Object var4 = var1.c();
               if (var3 != null && var4 != null) {
                  if (this.g(var3) != null) {
                     throw new b("Duplicate key \"" + var3 + "\"");
                  }

                  this.a(var3, var4);
               }

               switch(var1.b()) {
               case ',':
               case ';':
                  if (var1.b() == '}') {
                     return;
                  }

                  var1.a();
                  break;
               case '}':
                  return;
               default:
                  throw var1.a("Expected a ',' or '}'");
               }
            }
         }
      }
   }

   private c(Map var1) {
      this.b = new LinkedHashMap();
      if (var1 != null) {
         Iterator var4 = var1.entrySet().iterator();

         while(var4.hasNext()) {
            Entry var2;
            Object var3;
            if ((var3 = (var2 = (Entry)var4.next()).getValue()) != null) {
               this.b.put((String)var2.getKey(), a(var3));
            }
         }
      }

   }

   private c(Object var1) {
      this();
      Object var2 = var1;
      c var9 = this;
      Class var3;
      Method[] var10 = (var3 = var1.getClass()).getClassLoader() != null ? var3.getMethods() : var3.getDeclaredMethods();

      for(int var4 = 0; var4 < var10.length; ++var4) {
         try {
            Method var5;
            if (Modifier.isPublic((var5 = var10[var4]).getModifiers())) {
               String var6 = var5.getName();
               String var7 = "";
               if (var6.startsWith("get")) {
                  if (!"getClass".equals(var6) && !"getDeclaringClass".equals(var6)) {
                     var7 = var6.substring(3);
                  } else {
                     var7 = "";
                  }
               } else if (var6.startsWith("is")) {
                  var7 = var6.substring(2);
               }

               if (var7.length() > 0 && Character.isUpperCase(var7.charAt(0)) && var5.getParameterTypes().length == 0) {
                  if (var7.length() == 1) {
                     var7 = var7.toLowerCase();
                  } else if (!Character.isUpperCase(var7.charAt(1))) {
                     var7 = var7.substring(0, 1).toLowerCase() + var7.substring(1);
                  }

                  Object var11;
                  if ((var11 = var5.invoke(var2, (Object[])null)) != null) {
                     var9.b.put(var7, a(var11));
                  }
               }
            }
         } catch (Exception var8) {
         }
      }

   }

   public c(String var1) {
      this(new f(var1));
   }

   public final Object a(String var1) {
      if (var1 == null) {
         throw new b("Null key.");
      } else {
         Object var2;
         if ((var2 = this.g(var1)) == null) {
            throw new b("JSONObject[" + e(var1) + "] not found.");
         } else {
            return var2;
         }
      }
   }

   public final int b(String var1) {
      Object var2 = this.a(var1);

      try {
         return var2 instanceof Number ? ((Number)var2).intValue() : Integer.parseInt((String)var2);
      } catch (Exception var3) {
         throw new b("JSONObject[" + e(var1) + "] is not an int.");
      }
   }

   public final a c(String var1) {
      Object var2;
      if ((var2 = this.a(var1)) instanceof a) {
         return (a)var2;
      } else {
         throw new b("JSONObject[" + e(var1) + "] is not a JSONArray.");
      }
   }

   public final boolean d(String var1) {
      return this.b.containsKey(var1);
   }

   private Object g(String var1) {
      return var1 == null ? null : this.b.get(var1);
   }

   public final c a(String var1, int var2) {
      this.a(var1, (Object)(new Integer(var2)));
      return this;
   }

   public final c a(String var1, Object var2) {
      if (var1 == null) {
         throw new NullPointerException("Null key.");
      } else {
         if (var2 != null) {
            b(var2);
            this.b.put(var1, var2);
         } else {
            this.b.remove(var1);
         }

         return this;
      }
   }

   public static String e(String var0) {
      StringWriter var1;
      synchronized((var1 = new StringWriter()).getBuffer()) {
         String var10000;
         try {
            var10000 = a(var0, (Writer)var1).toString();
         } catch (IOException var3) {
            return "";
         }

         return var10000;
      }
   }

   private static Writer a(String var0, Writer var1) {
      if (var0 != null && var0.length() != 0) {
         char var3 = 0;
         int var5 = var0.length();
         var1.write(34);

         for(int var4 = 0; var4 < var5; ++var4) {
            char var2 = var3;
            switch(var3 = var0.charAt(var4)) {
            case '\b':
               var1.write("\\b");
               continue;
            case '\t':
               var1.write("\\t");
               continue;
            case '\n':
               var1.write("\\n");
               continue;
            case '\f':
               var1.write("\\f");
               continue;
            case '\r':
               var1.write("\\r");
               continue;
            case '"':
            case '\\':
               var1.write(92);
               break;
            case '/':
               if (var2 == '<') {
                  var1.write(92);
               }

               var1.write(var3);
               continue;
            default:
               if (var3 < ' ' || var3 >= 128 && var3 < 160 || var3 >= 8192 && var3 < 8448) {
                  var1.write("\\u");
                  String var6 = Integer.toHexString(var3);
                  var1.write("0000", 0, 4 - var6.length());
                  var1.write(var6);
                  continue;
               }
            }

            var1.write(var3);
         }

         var1.write(34);
         return var1;
      } else {
         var1.write("\"\"");
         return var1;
      }
   }

   public static Object f(String var0) {
      if (var0.equals("")) {
         return var0;
      } else if (var0.equalsIgnoreCase("true")) {
         return Boolean.TRUE;
      } else if (var0.equalsIgnoreCase("false")) {
         return Boolean.FALSE;
      } else if (var0.equalsIgnoreCase("null")) {
         return a;
      } else {
         char var1;
         if ((var1 = var0.charAt(0)) >= '0' && var1 <= '9' || var1 == '-') {
            try {
               if (var0.indexOf(46) < 0 && var0.indexOf(101) < 0 && var0.indexOf(69) < 0) {
                  Long var4 = new Long(var0);
                  if (var0.equals(var4.toString())) {
                     if (var4 == (long)var4.intValue()) {
                        return var4.intValue();
                     }

                     return var4;
                  }
               } else {
                  Double var3;
                  if (!(var3 = Double.valueOf(var0)).isInfinite() && !var3.isNaN()) {
                     return var3;
                  }
               }
            } catch (Exception var2) {
            }
         }

         return var0;
      }
   }

   private static void b(Object var0) {
      if (var0 != null) {
         if (var0 instanceof Double) {
            if (((Double)var0).isInfinite() || ((Double)var0).isNaN()) {
               throw new b("JSON does not allow non-finite numbers.");
            }
         } else if (var0 instanceof Float && (((Float)var0).isInfinite() || ((Float)var0).isNaN())) {
            throw new b("JSON does not allow non-finite numbers.");
         }
      }

   }

   public final String toString() {
      try {
         return this.a(0);
      } catch (Exception var1) {
         return null;
      }
   }

   private String a(int var1) {
      StringWriter var4;
      synchronized((var4 = new StringWriter()).getBuffer()) {
         return this.a(var4, 0, 0).toString();
      }
   }

   public static Object a(Object var0) {
      try {
         if (var0 == null) {
            return a;
         } else if (!(var0 instanceof c) && !(var0 instanceof a) && !a.equals(var0) && !(var0 instanceof e) && !(var0 instanceof Byte) && !(var0 instanceof Character) && !(var0 instanceof Short) && !(var0 instanceof Integer) && !(var0 instanceof Long) && !(var0 instanceof Boolean) && !(var0 instanceof Float) && !(var0 instanceof Double) && !(var0 instanceof String)) {
            if (var0 instanceof Collection) {
               return new a((Collection)var0);
            } else if (var0.getClass().isArray()) {
               return new a(var0);
            } else if (var0 instanceof Map) {
               return new c((Map)var0);
            } else {
               Package var1;
               String var3;
               return !(var3 = (var1 = var0.getClass().getPackage()) != null ? var1.getName() : "").startsWith("java.") && !var3.startsWith("javax.") && var0.getClass().getClassLoader() != null ? new c(var0) : var0.toString();
            }
         } else {
            return var0;
         }
      } catch (Exception var2) {
         return null;
      }
   }

   static final Writer a(Writer var0, Object var1, int var2, int var3) {
      if (var1 != null && !var1.equals((Object)null)) {
         if (var1 instanceof c) {
            ((c)var1).a(var0, var2, var3);
         } else if (var1 instanceof a) {
            ((a)var1).a(var0, var2, var3);
         } else if (var1 instanceof Map) {
            (new c((Map)var1)).a(var0, var2, var3);
         } else if (var1 instanceof Collection) {
            (new a((Collection)var1)).a(var0, var2, var3);
         } else if (var1.getClass().isArray()) {
            (new a(var1)).a(var0, var2, var3);
         } else if (var1 instanceof Number) {
            Number var5;
            if ((var5 = (Number)var1) == null) {
               throw new b("Null pointer");
            }

            b((Object)var5);
            String var6;
            if ((var6 = var5.toString()).indexOf(46) > 0 && var6.indexOf(101) < 0 && var6.indexOf(69) < 0) {
               while(var6.endsWith("0")) {
                  var6 = var6.substring(0, var6.length() - 1);
               }

               if (var6.endsWith(".")) {
                  var6 = var6.substring(0, var6.length() - 1);
               }
            }

            var0.write(var6);
         } else if (var1 instanceof Boolean) {
            var0.write(var1.toString());
         } else if (var1 instanceof e) {
            String var7;
            try {
               var7 = ((e)var1).a();
            } catch (Exception var4) {
               throw new b(var4);
            }

            var0.write(var7 != null ? var7.toString() : e(var1.toString()));
         } else {
            a(var1.toString(), var0);
         }
      } else {
         var0.write("null");
      }

      return var0;
   }

   static final void a(Writer var0, int var1) {
      for(int var2 = 0; var2 < var1; ++var2) {
         var0.write(32);
      }

   }

   private Writer a(Writer var1, int var2, int var3) {
      try {
         boolean var4 = false;
         int var5 = this.b.size();
         Iterator var6 = this.b.keySet().iterator();
         var1.write(123);
         if (var5 == 1) {
            Object var9 = var6.next();
            var1.write(e(var9.toString()));
            var1.write(58);
            if (var2 > 0) {
               var1.write(32);
            }

            a(var1, this.b.get(var9), var2, var3);
         } else if (var5 != 0) {
            for(var5 = var3 + var2; var6.hasNext(); var4 = true) {
               Object var7 = var6.next();
               if (var4) {
                  var1.write(44);
               }

               if (var2 > 0) {
                  var1.write(10);
               }

               a(var1, var5);
               var1.write(e(var7.toString()));
               var1.write(58);
               if (var2 > 0) {
                  var1.write(32);
               }

               a(var1, this.b.get(var7), var2, var5);
            }

            if (var2 > 0) {
               var1.write(10);
            }

            a(var1, var3);
         }

         var1.write(125);
         return var1;
      } catch (IOException var8) {
         throw new b(var8);
      }
   }
}

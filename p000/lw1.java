package p000;

import android.os.Build;
import android.util.Log;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class lw1 {

    /* JADX INFO: renamed from: a */
    public static final Unsafe f24412a;

    /* JADX INFO: renamed from: b */
    public static final long f24413b;

    /* JADX INFO: renamed from: c */
    public static final long f24414c;

    /* JADX INFO: renamed from: d */
    public static final long f24415d;

    /* JADX INFO: renamed from: e */
    public static final long f24416e;

    /* JADX INFO: renamed from: f */
    public static final long f24417f;

    static {
        new HashMap();
        try {
            f24412a = (Unsafe) Unsafe.class.getDeclaredMethod("getUnsafe", null).invoke(null, null);
            long[] jArrM8124c = jw1.f22699a;
            if (jArrM8124c == null) {
                jArrM8124c = m8124c();
                if (jw1.f22699a != null) {
                    throw new IllegalArgumentException();
                }
                jw1.f22699a = jArrM8124c;
            }
            f24413b = jArrM8124c[0];
            long j = jArrM8124c[1];
            long j2 = jArrM8124c[2];
            f24414c = j2;
            long j3 = jArrM8124c[3];
            f24415d = j3;
            long j4 = jArrM8124c[4];
            long j5 = jArrM8124c[5];
            long[] jArrM8125d = m8125d(j2, j3, j4);
            f24416e = jArrM8125d[0];
            f24417f = jArrM8125d[1];
            int i = Build.VERSION.SDK_INT;
            if (i < 37) {
                m8123b("i", "j");
            }
            if (i < 37) {
                m8123b("s", "t");
            }
        } catch (ReflectiveOperationException e) {
            Log.e("HiddenApiBypass", "Initialize error", e);
            throw new ExceptionInInitializerError(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Object m8122a(Class cls, Object obj, Object... objArr) throws NoSuchMethodException {
        if (obj != null && !cls.isInstance(obj)) {
            C1077qn.m9987m("this object is not an instance of the given class");
            return null;
        }
        Method declaredMethod = gw1.class.getDeclaredMethod("invoke", Object[].class);
        declaredMethod.setAccessible(true);
        long j = f24415d;
        Unsafe unsafe = f24412a;
        long j2 = unsafe.getLong(cls, j);
        if (j2 == 0) {
            throw new NoSuchMethodException("Cannot find matching method");
        }
        int i = unsafe.getInt(j2);
        for (int i2 = 0; i2 < i; i2++) {
            f24412a.putLong(declaredMethod, f24413b, f24417f + (((long) i2) * f24416e) + j2);
            if ("showSessionFromSession".equals(declaredMethod.getName())) {
                Class<?>[] parameterTypes = declaredMethod.getParameterTypes();
                long[] jArr = jw1.f22699a;
                if (parameterTypes.length == objArr.length) {
                    for (int i3 = 0; i3 < parameterTypes.length; i3++) {
                        if (parameterTypes[i3].isPrimitive()) {
                            Class<?> cls2 = parameterTypes[i3];
                            if ((cls2 != Integer.TYPE || (objArr[i3] instanceof Integer)) && ((cls2 != Byte.TYPE || (objArr[i3] instanceof Byte)) && ((cls2 != Character.TYPE || (objArr[i3] instanceof Character)) && ((cls2 != Boolean.TYPE || (objArr[i3] instanceof Boolean)) && ((cls2 != Double.TYPE || (objArr[i3] instanceof Double)) && ((cls2 != Float.TYPE || (objArr[i3] instanceof Float)) && ((cls2 != Long.TYPE || (objArr[i3] instanceof Long)) && (cls2 != Short.TYPE || (objArr[i3] instanceof Short))))))))) {
                            }
                        } else {
                            Object obj2 = objArr[i3];
                            if (obj2 == null || parameterTypes[i3].isInstance(obj2)) {
                            }
                        }
                    }
                    return declaredMethod.invoke(obj, objArr);
                }
                continue;
            }
        }
        throw new NoSuchMethodException("Cannot find matching method");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004f  */
    /* JADX INFO: renamed from: b */
    public static boolean m8123b(String str, String str2) {
        Throwable th;
        boolean z;
        try {
            Field declaredField = iw1.class.getDeclaredField(str);
            Field declaredField2 = iw1.class.getDeclaredField(str2);
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            MethodHandle methodHandleUnreflectGetter = MethodHandles.lookup().unreflectGetter(declaredField);
            MethodHandle methodHandleUnreflectGetter2 = MethodHandles.lookup().unreflectGetter(declaredField2);
            Unsafe unsafe = f24412a;
            long j = f24414c;
            long j2 = unsafe.getLong(methodHandleUnreflectGetter, j);
            try {
                unsafe.putLong(methodHandleUnreflectGetter, j, unsafe.getLong(methodHandleUnreflectGetter2, j));
                Field field = (Field) MethodHandles.reflectAs(Field.class, methodHandleUnreflectGetter);
                if (field.getDeclaringClass() == iw1.class) {
                    try {
                        z = str2.equals(field.getName());
                    } catch (Throwable th2) {
                        th = th2;
                        f24412a.putLong(methodHandleUnreflectGetter, f24414c, j2);
                        throw th;
                    }
                }
                unsafe.putLong(methodHandleUnreflectGetter, j, j2);
                return z;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (LinkageError | ReflectiveOperationException | RuntimeException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static long[] m8124c() throws NoSuchFieldException {
        long jObjectFieldOffset;
        long jObjectFieldOffset2;
        Field declaredField = fw1.class.getDeclaredField("artMethod");
        Unsafe unsafe = f24412a;
        long jObjectFieldOffset3 = unsafe.objectFieldOffset(declaredField);
        long jObjectFieldOffset4 = unsafe.objectFieldOffset(fw1.class.getDeclaredField("declaringClass"));
        long jObjectFieldOffset5 = unsafe.objectFieldOffset(hw1.class.getDeclaredField("artFieldOrMethod"));
        long jObjectFieldOffset6 = unsafe.objectFieldOffset(ew1.class.getDeclaredField("methods"));
        try {
            jObjectFieldOffset = unsafe.objectFieldOffset(ew1.class.getDeclaredField("fields"));
        } catch (NoSuchFieldException unused) {
            jObjectFieldOffset = unsafe.objectFieldOffset(ew1.class.getDeclaredField("iFields"));
            jObjectFieldOffset2 = unsafe.objectFieldOffset(ew1.class.getDeclaredField("sFields"));
            long j = unsafe.getLong(iw1.class, jObjectFieldOffset);
            if (j != 0 && unsafe.getInt(j) == 4) {
            }
            return new long[]{jObjectFieldOffset3, jObjectFieldOffset4, jObjectFieldOffset5, jObjectFieldOffset6, jObjectFieldOffset, jObjectFieldOffset2};
        }
        jObjectFieldOffset2 = jObjectFieldOffset;
        return new long[]{jObjectFieldOffset3, jObjectFieldOffset4, jObjectFieldOffset5, jObjectFieldOffset6, jObjectFieldOffset, jObjectFieldOffset2};
    }

    /* JADX INFO: renamed from: d */
    public static long[] m8125d(long j, long j2, long j3) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException {
        Method declaredMethod = iw1.class.getDeclaredMethod("a", null);
        Method declaredMethod2 = iw1.class.getDeclaredMethod("b", null);
        declaredMethod.setAccessible(true);
        declaredMethod2.setAccessible(true);
        MethodHandle methodHandleUnreflect = MethodHandles.lookup().unreflect(declaredMethod);
        MethodHandle methodHandleUnreflect2 = MethodHandles.lookup().unreflect(declaredMethod2);
        Unsafe unsafe = f24412a;
        long j4 = unsafe.getLong(methodHandleUnreflect, j);
        long j5 = unsafe.getLong(methodHandleUnreflect2, j) - j4;
        long j6 = (j4 - unsafe.getLong(iw1.class, j2)) - j5;
        Field declaredField = iw1.class.getDeclaredField("i");
        Field declaredField2 = iw1.class.getDeclaredField("j");
        declaredField.setAccessible(true);
        declaredField2.setAccessible(true);
        MethodHandle methodHandleUnreflectGetter = MethodHandles.lookup().unreflectGetter(declaredField);
        MethodHandle methodHandleUnreflectGetter2 = MethodHandles.lookup().unreflectGetter(declaredField2);
        long j7 = unsafe.getLong(methodHandleUnreflectGetter, j);
        return new long[]{j5, j6, unsafe.getLong(methodHandleUnreflectGetter2, j) - j7, j7 - unsafe.getLong(iw1.class, j3)};
    }
}

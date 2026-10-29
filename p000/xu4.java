package p000;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.invoke.VarHandle;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class xu4 {

    /* JADX INFO: renamed from: a */
    public static final xu4 f34631a;

    static {
        xu4 wu4Var;
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(null);
                    Method method = cls.getMethod("allocateInstance", Class.class);
                    tu4 tu4Var = new tu4();
                    tu4Var.f31459b = method;
                    tu4Var.f31460c = obj;
                    VarHandle.storeStoreFence();
                    wu4Var = tu4Var;
                } catch (Exception unused) {
                    wu4Var = new wu4();
                }
            } catch (Exception unused2) {
                Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod.setAccessible(true);
                vu4 vu4Var = new vu4();
                vu4Var.f32881b = declaredMethod;
                VarHandle.storeStoreFence();
                wu4Var = vu4Var;
            }
        } catch (Exception unused3) {
            Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
            declaredMethod2.setAccessible(true);
            int iIntValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
            Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
            declaredMethod3.setAccessible(true);
            uu4 uu4Var = new uu4();
            uu4Var.f32191b = declaredMethod3;
            uu4Var.f32192c = iIntValue;
            VarHandle.storeStoreFence();
            wu4Var = uu4Var;
        }
        f34631a = wu4Var;
    }

    /* JADX INFO: renamed from: a */
    public Object mo11164a(Class cls) {
        throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
    }
}

package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ul3 extends c20 {

    /* JADX INFO: renamed from: o */
    public final Method f31968o = Class.class.getMethod("isRecord", null);

    /* JADX INFO: renamed from: p */
    public final Method f31969p = Class.class.getMethod("getRecordComponents", null);

    /* JADX INFO: renamed from: q */
    public final Method f31970q;

    /* JADX INFO: renamed from: r */
    public final Method f31971r;

    public ul3() throws ClassNotFoundException {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.f31970q = cls.getMethod("getName", null);
        this.f31971r = cls.getMethod("getType", null);
    }

    @Override // p000.c20
    /* JADX INFO: renamed from: p */
    public final Method mo3828p(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e) {
            xy4.m12785n("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // p000.c20
    /* JADX INFO: renamed from: r */
    public final Constructor mo3829r(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f31969p.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = (Class) this.f31971r.invoke(objArr[i], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e) {
            xy4.m12785n("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // p000.c20
    /* JADX INFO: renamed from: v */
    public final String[] mo3830v(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f31969p.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = (String) this.f31970q.invoke(objArr[i], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e) {
            xy4.m12785n("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return null;
        }
    }

    @Override // p000.c20
    /* JADX INFO: renamed from: z */
    public final boolean mo3831z(Class cls) {
        try {
            return ((Boolean) this.f31968o.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e) {
            xy4.m12785n("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
            return false;
        }
    }
}

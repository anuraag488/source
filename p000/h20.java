package p000;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class h20 implements InvocationHandler {

    /* JADX INFO: renamed from: a */
    public Object f20276a;

    public final boolean equals(Object obj) {
        Object obj2 = this.f20276a;
        if (obj == null) {
            return false;
        }
        return obj instanceof h20 ? obj2.equals(((h20) obj).f20276a) : obj2.equals(obj);
    }

    public final int hashCode() {
        return this.f20276a.hashCode();
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        Object obj2 = this.f20276a;
        try {
            return Class.forName(method.getDeclaringClass().getName(), true, obj2.getClass().getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(obj2, objArr);
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } catch (ReflectiveOperationException e2) {
            ds3.m4668l("Reflection failed for method ", method, e2);
            return null;
        }
    }
}

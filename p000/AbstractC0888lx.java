package p000;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: lx */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0888lx implements wm0, bp0, Serializable {
    private final wm0 completion;

    public AbstractC0888lx(wm0 wm0Var) {
        this.completion = wm0Var;
    }

    public wm0 create(wm0 wm0Var, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // p000.bp0
    public bp0 getCallerFrame() {
        wm0 wm0Var = this.completion;
        if (wm0Var instanceof bp0) {
            return (bp0) wm0Var;
        }
        return null;
    }

    public final wm0 getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int iIntValue;
        String strM4743c;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        dv0 dv0Var = (dv0) getClass().getAnnotation(dv0.class);
        String str = null;
        if (dv0Var == null || dv0Var.m4747v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? dv0Var.m4745l()[iIntValue] : -1;
        tt2 tt2Var = kx5.f23596h;
        tt2 tt2Var2 = kx5.f23597i;
        if (tt2Var2 == null) {
            try {
                tt2 tt2Var3 = new tt2(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                kx5.f23597i = tt2Var3;
                tt2Var2 = tt2Var3;
            } catch (Exception unused2) {
                kx5.f23597i = tt2Var;
                tt2Var2 = tt2Var;
            }
        }
        if (tt2Var2 != tt2Var && (method = (Method) tt2Var2.f31428b) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = (Method) tt2Var2.f31429c) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = (Method) tt2Var2.f31430d;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strM4743c = dv0Var.m4743c();
        } else {
            strM4743c = str + '/' + dv0Var.m4743c();
        }
        return new StackTraceElement(strM4743c, dv0Var.m4746m(), dv0Var.m4744f(), i);
    }

    public Object invokeSuspend(Object obj) {
        k43.m7376J(obj);
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // p000.wm0
    public final void resumeWith(Object obj) {
        ?? r2 = this;
        while (true) {
            AbstractC0888lx abstractC0888lx = (AbstractC0888lx) r2;
            wm0 wm0Var = abstractC0888lx.completion;
            try {
                obj = abstractC0888lx.invokeSuspend(obj);
                if (obj == ap0.f14763a) {
                    return;
                }
            } catch (Throwable th) {
                obj = k43.m7389n(th);
            }
            abstractC0888lx.releaseIntercepted();
            if (!(wm0Var instanceof AbstractC0888lx)) {
                wm0Var.resumeWith(obj);
                return;
            }
            r2 = wm0Var;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public void releaseIntercepted() {
    }
}

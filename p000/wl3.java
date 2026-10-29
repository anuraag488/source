package p000;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class wl3 {

    /* JADX INFO: renamed from: a */
    public String f33462a;

    /* JADX INFO: renamed from: b */
    public Field f33463b;

    /* JADX INFO: renamed from: c */
    public String f33464c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Method f33465d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ uq4 f33466e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ uq4 f33467f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ boolean f33468g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ boolean f33469h;

    /* JADX INFO: renamed from: a */
    public final void m12324a(yb2 yb2Var, Object obj) throws IllegalAccessException {
        Object objInvoke;
        Field field = this.f33463b;
        Method method = this.f33465d;
        if (method != null) {
            try {
                objInvoke = method.invoke(obj, null);
            } catch (InvocationTargetException e) {
                throw new ia2(zi4.m13621u("Accessor ", vl3.m11928d(method, false), " threw exception"), e.getCause());
            }
        } else {
            objInvoke = field.get(obj);
        }
        if (objInvoke == obj) {
            return;
        }
        yb2Var.mo12210l(this.f33462a);
        this.f33466e.mo167c(yb2Var, objInvoke);
    }
}

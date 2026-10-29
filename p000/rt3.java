package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rt3 extends ym0 implements ti1 {

    /* JADX INFO: renamed from: t */
    public final ti1 f29606t;

    /* JADX INFO: renamed from: u */
    public final ro0 f29607u;

    /* JADX INFO: renamed from: v */
    public final int f29608v;

    /* JADX INFO: renamed from: w */
    public ro0 f29609w;

    /* JADX INFO: renamed from: x */
    public wm0 f29610x;

    public rt3(ti1 ti1Var, ro0 ro0Var) {
        super(ef0.f18041c, r71.f29063a);
        this.f29606t = ti1Var;
        this.f29607u = ro0Var;
        this.f29608v = ((Number) ro0Var.fold(new z13((byte) 1), 0)).intValue();
    }

    @Override // p000.ti1
    public final Object emit(Object obj, wm0 wm0Var) {
        try {
            Object objM10425i = m10425i(wm0Var, obj);
            return objM10425i == ap0.f14763a ? objM10425i : ju4.f22634a;
        } catch (Throwable th) {
            this.f29609w = new o11(wm0Var.getContext(), th);
            throw th;
        }
    }

    @Override // p000.AbstractC0888lx, p000.bp0
    public final bp0 getCallerFrame() {
        wm0 wm0Var = this.f29610x;
        if (wm0Var instanceof bp0) {
            return (bp0) wm0Var;
        }
        return null;
    }

    @Override // p000.ym0, p000.wm0
    public final ro0 getContext() {
        ro0 ro0Var = this.f29609w;
        return ro0Var == null ? r71.f29063a : ro0Var;
    }

    @Override // p000.AbstractC0888lx
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final Object m10425i(wm0 wm0Var, Object obj) {
        ro0 context = wm0Var.getContext();
        y70.m13040t(context);
        ro0 ro0Var = this.f29609w;
        if (ro0Var != context) {
            if (ro0Var instanceof o11) {
                throw new IllegalStateException(id4.m6767N("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((o11) ro0Var).f26282b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            C1017p0 c1017p0 = new C1017p0((byte) 29);
            c1017p0.f27254b = this;
            VarHandle.storeStoreFence();
            if (((Number) context.fold(c1017p0, 0)).intValue() != this.f29608v) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f29607u + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f29609w = context;
        }
        this.f29610x = wm0Var;
        Object objInvoke = tt3.f31431a.invoke(this.f29606t, obj, this);
        if (!z62.m13387o(objInvoke, ap0.f14763a)) {
            this.f29610x = null;
        }
        return objInvoke;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        Throwable thM4638b = dp3.m4638b(obj);
        if (thM4638b != null) {
            this.f29609w = new o11(getContext(), thM4638b);
        }
        wm0 wm0Var = this.f29610x;
        if (wm0Var != null) {
            wm0Var.resumeWith(obj);
        }
        return ap0.f14763a;
    }
}

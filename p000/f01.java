package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class f01 extends i01 implements bp0, wm0 {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ long f18625h = AbstractC1078qo.f28633a.objectFieldOffset(f01.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: d */
    public so0 f18626d;

    /* JADX INFO: renamed from: e */
    public ym0 f18627e;

    /* JADX INFO: renamed from: f */
    public Object f18628f;

    /* JADX INFO: renamed from: g */
    public Object f18629g;

    @Override // p000.bp0
    public final bp0 getCallerFrame() {
        ym0 ym0Var = this.f18627e;
        if (ym0Var != null) {
            return ym0Var;
        }
        return null;
    }

    @Override // p000.wm0
    public final ro0 getContext() {
        return this.f18627e.getContext();
    }

    @Override // p000.i01
    /* JADX INFO: renamed from: i */
    public final Object mo3488i() {
        Object obj = this.f18628f;
        this.f18628f = g01.f19457a;
        return obj;
    }

    @Override // p000.wm0
    public final void resumeWith(Object obj) {
        Throwable thM4638b = dp3.m4638b(obj);
        Object ff0Var = thM4638b == null ? obj : new ff0(thM4638b, false);
        so0 so0Var = this.f18626d;
        ym0 ym0Var = this.f18627e;
        if (g01.m5869c(so0Var, ym0Var.getContext())) {
            this.f18628f = ff0Var;
            this.f20971c = 0;
            g01.m5868b(so0Var, ym0Var.getContext(), this);
            return;
        }
        eb1 eb1VarM5204a = em4.m5204a();
        if (eb1VarM5204a.f17948b >= 4294967296L) {
            this.f18628f = ff0Var;
            this.f20971c = 0;
            eb1VarM5204a.m5044P(this);
            return;
        }
        eb1VarM5204a.m5049U(true);
        try {
            ro0 context = ym0Var.getContext();
            Object objM4555b = dm4.m4555b(context, this.f18629g);
            try {
                ym0Var.resumeWith(obj);
                dm4.m4554a(context, objM4555b);
                while (eb1VarM5204a.m5052X()) {
                }
            } catch (Throwable th) {
                dm4.m4554a(context, objM4555b);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                m6536g(th2);
            } finally {
                eb1VarM5204a.m5043O(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f18626d + ", " + ev0.m5373w0(this.f18627e) + ']';
    }

    @Override // p000.i01
    /* JADX INFO: renamed from: d */
    public final wm0 mo3485d() {
        return this;
    }
}

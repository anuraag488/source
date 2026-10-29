package p000;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class i01 extends ji4 {

    /* JADX INFO: renamed from: c */
    public int f20971c;

    public i01(int i) {
        super(0L, false);
        this.f20971c = i;
    }

    /* JADX INFO: renamed from: d */
    public abstract wm0 mo3485d();

    /* JADX INFO: renamed from: e */
    public Throwable mo3486e(Object obj) {
        ff0 ff0Var = obj instanceof ff0 ? (ff0) obj : null;
        if (ff0Var != null) {
            return ff0Var.f18941a;
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final void m6536g(Throwable th) {
        n40.m8509s(mo3485d().getContext(), new dp0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* JADX INFO: renamed from: i */
    public abstract Object mo3488i();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            f01 f01Var = (f01) mo3485d();
            ym0 ym0Var = f01Var.f18627e;
            Object obj = f01Var.f18629g;
            ro0 context = ym0Var.getContext();
            Object objM4555b = dm4.m4555b(context, obj);
            t82 t82Var = null;
            zt4 zt4VarM3805J = objM4555b != dm4.f17189a ? c20.m3805J(ym0Var, context, objM4555b) : null;
            try {
                ro0 context2 = ym0Var.getContext();
                Object objMo3488i = mo3488i();
                Throwable thMo3486e = mo3486e(objMo3488i);
                if (thMo3486e == null) {
                    int i = this.f20971c;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        t82Var = (t82) context2.get(o85.f26448h);
                    }
                }
                if (t82Var != null && !t82Var.mo4995b()) {
                    CancellationException cancellationExceptionMo5006u = t82Var.mo5006u();
                    mo3484c(cancellationExceptionMo5006u);
                    ym0Var.resumeWith(k43.m7389n(cancellationExceptionMo5006u));
                } else if (thMo3486e != null) {
                    ym0Var.resumeWith(k43.m7389n(thMo3486e));
                } else {
                    ym0Var.resumeWith(mo3487f(objMo3488i));
                }
            } finally {
                if (zt4VarM3805J == null || zt4VarM3805J.m13753l0()) {
                    dm4.m4554a(context, objM4555b);
                }
            }
        } catch (e01 e) {
            n40.m8509s(mo3485d().getContext(), e.f17555a);
        } catch (Throwable th) {
            m6536g(th);
        }
    }

    /* JADX INFO: renamed from: c */
    public void mo3484c(CancellationException cancellationException) {
    }

    /* JADX INFO: renamed from: f */
    public Object mo3487f(Object obj) {
        return obj;
    }
}

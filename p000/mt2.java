package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class mt2 implements px0 {

    /* JADX INFO: renamed from: b */
    public um0 f25196b;

    /* JADX INFO: renamed from: c */
    public int f25197c;

    /* JADX INFO: renamed from: e */
    public mt2 f25199e;

    /* JADX INFO: renamed from: f */
    public mt2 f25200f;

    /* JADX INFO: renamed from: g */
    public z23 f25201g;

    /* JADX INFO: renamed from: h */
    public e13 f25202h;

    /* JADX INFO: renamed from: i */
    public boolean f25203i;

    /* JADX INFO: renamed from: j */
    public boolean f25204j;

    /* JADX INFO: renamed from: k */
    public boolean f25205k;

    /* JADX INFO: renamed from: l */
    public boolean f25206l;

    /* JADX INFO: renamed from: m */
    public jp1 f25207m;

    /* JADX INFO: renamed from: n */
    public boolean f25208n;

    /* JADX INFO: renamed from: a */
    public mt2 f25195a = this;

    /* JADX INFO: renamed from: d */
    public int f25198d = -1;

    /* JADX INFO: renamed from: C0 */
    public final zo0 m8391C0() {
        um0 um0Var = this.f25196b;
        if (um0Var != null) {
            return um0Var;
        }
        um0 um0VarM13670b = zp0.m13670b(((ViewTreeObserverOnGlobalLayoutListenerC1140sc) sc6.m10653Y(this)).getCoroutineContext().plus(new v82((t82) ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) sc6.m10653Y(this)).getCoroutineContext().get(o85.f26448h))));
        this.f25196b = um0VarM13670b;
        return um0VarM13670b;
    }

    /* JADX INFO: renamed from: D0 */
    public boolean mo4191D0() {
        return !(this instanceof C0850kw);
    }

    /* JADX INFO: renamed from: E0 */
    public void mo8392E0() {
        if (this.f25208n) {
            q32.m9721c("node attached multiple times");
        }
        if (this.f25202h == null) {
            q32.m9721c("attach invoked on a node without a coordinator");
        }
        this.f25208n = true;
        this.f25205k = true;
    }

    /* JADX INFO: renamed from: F0 */
    public void mo8393F0() {
        if (!this.f25208n) {
            q32.m9721c("Cannot detach a node that is not attached");
        }
        if (this.f25205k) {
            q32.m9721c("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.f25206l) {
            q32.m9721c("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.f25208n = false;
        um0 um0Var = this.f25196b;
        if (um0Var != null) {
            zp0.m13682n(um0Var, new rt2("The Modifier.Node was detached", (byte) 2));
            this.f25196b = null;
        }
    }

    /* JADX INFO: renamed from: J0 */
    public void mo8394J0() {
        if (!this.f25208n) {
            q32.m9721c("reset() called on an unattached node");
        }
        mo6006I0();
    }

    /* JADX INFO: renamed from: K0 */
    public void mo8395K0() {
        if (!this.f25208n) {
            q32.m9721c("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.f25205k) {
            q32.m9721c("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.f25205k = false;
        mo26G0();
        this.f25206l = true;
    }

    /* JADX INFO: renamed from: L0 */
    public void mo8396L0() {
        if (!this.f25208n) {
            q32.m9721c("node detached multiple times");
        }
        if (this.f25202h == null) {
            q32.m9721c("detach invoked on a node without a coordinator");
        }
        if (!this.f25206l) {
            q32.m9721c("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.f25206l = false;
        jp1 jp1Var = this.f25207m;
        if (jp1Var != null) {
            jp1Var.invoke();
        }
        mo27H0();
    }

    /* JADX INFO: renamed from: M0 */
    public void mo8397M0(mt2 mt2Var) {
        this.f25195a = mt2Var;
    }

    /* JADX INFO: renamed from: N0 */
    public void mo8398N0(e13 e13Var) {
        this.f25202h = e13Var;
    }

    /* JADX INFO: renamed from: G0 */
    public void mo26G0() {
    }

    /* JADX INFO: renamed from: H0 */
    public void mo27H0() {
    }

    /* JADX INFO: renamed from: I0 */
    public void mo6006I0() {
    }
}

package p000;

import java.lang.invoke.VarHandle;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fi0 extends AbstractC1091r0 {

    /* JADX INFO: renamed from: j */
    public d83 f19012j;

    /* JADX INFO: renamed from: k */
    public boolean f19013k;

    @Override // p000.AbstractC1091r0
    /* JADX INFO: renamed from: a */
    public final void mo3976a(int i, mi0 mi0Var) {
        ir1 ir1Var = (ir1) mi0Var;
        ir1Var.m6889f0(420213850);
        int i2 = i | (ir1Var.m6894i(this) ? 4 : 2);
        if (ir1Var.m6871T(i2 & 1, (i2 & 3) != 2)) {
            mq1 mq1Var = (mq1) this.f19012j.getValue();
            if (mq1Var == null) {
                ir1Var.m6885d0(-1238823553);
            } else {
                ir1Var.m6885d0(98585282);
                mq1Var.invoke(ir1Var, 0);
            }
            ir1Var.m6912r(false);
        } else {
            ir1Var.m6874W();
        }
        yk3 yk3VarM6916v = ir1Var.m6916v();
        if (yk3VarM6916v != null) {
            C1017p0 c1017p0 = new C1017p0((byte) 10);
            c1017p0.f27254b = this;
            VarHandle.storeStoreFence();
            yk3VarM6916v.f35300d = c1017p0;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return fi0.class.getName();
    }

    @Override // p000.AbstractC1091r0
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f19013k;
    }

    public final void setContent(mq1 mq1Var) {
        this.f19013k = true;
        this.f19012j.setValue(mq1Var);
        if (isAttachedToWindow() || getComposeViewContext$ui() != null) {
            m10170d();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}

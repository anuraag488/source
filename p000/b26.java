package p000;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class b26 extends h26 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ byte f15044e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ p26 f15045f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ x36 f15046g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b26(x36 x36Var, p26 p26Var, byte b) {
        super(x36Var, true);
        this.f15044e = b;
        switch (b) {
            case 1:
                this.f15045f = p26Var;
                Objects.requireNonNull(x36Var);
                this.f15046g = x36Var;
                super(x36Var, true);
                break;
            default:
                this.f15045f = p26Var;
                Objects.requireNonNull(x36Var);
                this.f15046g = x36Var;
                break;
        }
    }

    @Override // p000.h26
    /* JADX INFO: renamed from: a */
    public final void mo3419a() {
        switch (this.f15044e) {
            case 0:
                gx5 gx5Var = this.f15046g.f33967g;
                y42.m12854a0(gx5Var);
                gx5Var.registerOnMeasurementEventListener(this.f15045f);
                break;
            default:
                gx5 gx5Var2 = this.f15046g.f33967g;
                y42.m12854a0(gx5Var2);
                gx5Var2.unregisterOnMeasurementEventListener(this.f15045f);
                break;
        }
    }
}

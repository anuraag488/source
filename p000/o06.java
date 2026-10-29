package p000;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class o06 extends h26 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ byte f26275e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ zw5 f26276f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ x36 f26277g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o06(x36 x36Var, zw5 zw5Var, byte b) {
        super(x36Var, true);
        this.f26275e = b;
        switch (b) {
            case 1:
                this.f26276f = zw5Var;
                Objects.requireNonNull(x36Var);
                this.f26277g = x36Var;
                super(x36Var, true);
                break;
            case 2:
                this.f26276f = zw5Var;
                Objects.requireNonNull(x36Var);
                this.f26277g = x36Var;
                super(x36Var, true);
                break;
            case 3:
                this.f26276f = zw5Var;
                Objects.requireNonNull(x36Var);
                this.f26277g = x36Var;
                super(x36Var, true);
                break;
            case 4:
                this.f26276f = zw5Var;
                Objects.requireNonNull(x36Var);
                this.f26277g = x36Var;
                super(x36Var, true);
                break;
            default:
                this.f26276f = zw5Var;
                Objects.requireNonNull(x36Var);
                this.f26277g = x36Var;
                break;
        }
    }

    @Override // p000.h26
    /* JADX INFO: renamed from: a */
    public final void mo3419a() {
        switch (this.f26275e) {
            case 0:
                gx5 gx5Var = this.f26277g.f33967g;
                y42.m12854a0(gx5Var);
                gx5Var.getGmpAppId(this.f26276f);
                break;
            case 1:
                gx5 gx5Var2 = this.f26277g.f33967g;
                y42.m12854a0(gx5Var2);
                gx5Var2.getCachedAppInstanceId(this.f26276f);
                break;
            case 2:
                gx5 gx5Var3 = this.f26277g.f33967g;
                y42.m12854a0(gx5Var3);
                gx5Var3.generateEventId(this.f26276f);
                break;
            case 3:
                gx5 gx5Var4 = this.f26277g.f33967g;
                y42.m12854a0(gx5Var4);
                gx5Var4.getCurrentScreenName(this.f26276f);
                break;
            default:
                gx5 gx5Var5 = this.f26277g.f33967g;
                y42.m12854a0(gx5Var5);
                gx5Var5.getCurrentScreenClass(this.f26276f);
                break;
        }
    }

    @Override // p000.h26
    /* JADX INFO: renamed from: b */
    public final void mo6202b() {
        byte b = this.f26275e;
        zw5 zw5Var = this.f26276f;
        switch (b) {
            case 0:
                zw5Var.mo7338h(null);
                break;
            case 1:
                zw5Var.mo7338h(null);
                break;
            case 2:
                zw5Var.mo7338h(null);
                break;
            case 3:
                zw5Var.mo7338h(null);
                break;
            default:
                zw5Var.mo7338h(null);
                break;
        }
    }
}

package p000;

import android.app.Activity;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class t26 extends h26 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ byte f30737e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Activity f30738f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ zs5 f30739g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t26(zs5 zs5Var, Activity activity, byte b) {
        super((x36) zs5Var.f36348b, true);
        this.f30737e = b;
        switch (b) {
            case 1:
                this.f30738f = activity;
                this.f30739g = zs5Var;
                super((x36) zs5Var.f36348b, true);
                break;
            case 2:
                this.f30738f = activity;
                this.f30739g = zs5Var;
                super((x36) zs5Var.f36348b, true);
                break;
            case 3:
                this.f30738f = activity;
                this.f30739g = zs5Var;
                super((x36) zs5Var.f36348b, true);
                break;
            case 4:
                this.f30738f = activity;
                this.f30739g = zs5Var;
                super((x36) zs5Var.f36348b, true);
                break;
            default:
                this.f30738f = activity;
                this.f30739g = zs5Var;
                break;
        }
    }

    @Override // p000.h26
    /* JADX INFO: renamed from: a */
    public final void mo3419a() {
        switch (this.f30737e) {
            case 0:
                gx5 gx5Var = ((x36) this.f30739g.f36348b).f33967g;
                y42.m12854a0(gx5Var);
                gx5Var.onActivityStartedByScionActivityInfo(pz5.m9692a(this.f30738f), this.f20288b);
                break;
            case 1:
                gx5 gx5Var2 = ((x36) this.f30739g.f36348b).f33967g;
                y42.m12854a0(gx5Var2);
                gx5Var2.onActivityResumedByScionActivityInfo(pz5.m9692a(this.f30738f), this.f20288b);
                break;
            case 2:
                gx5 gx5Var3 = ((x36) this.f30739g.f36348b).f33967g;
                y42.m12854a0(gx5Var3);
                gx5Var3.onActivityPausedByScionActivityInfo(pz5.m9692a(this.f30738f), this.f20288b);
                break;
            case 3:
                gx5 gx5Var4 = ((x36) this.f30739g.f36348b).f33967g;
                y42.m12854a0(gx5Var4);
                gx5Var4.onActivityStoppedByScionActivityInfo(pz5.m9692a(this.f30738f), this.f20288b);
                break;
            default:
                gx5 gx5Var5 = ((x36) this.f30739g.f36348b).f33967g;
                y42.m12854a0(gx5Var5);
                gx5Var5.onActivityDestroyedByScionActivityInfo(pz5.m9692a(this.f30738f), this.f20288b);
                break;
        }
    }
}

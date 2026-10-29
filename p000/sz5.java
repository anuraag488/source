package p000;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class sz5 extends h26 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ byte f30695e = 0;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ x36 f30696f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f30697g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz5(x36 x36Var, Bundle bundle) {
        super(x36Var, true);
        this.f30697g = bundle;
        Objects.requireNonNull(x36Var);
        this.f30696f = x36Var;
    }

    @Override // p000.h26
    /* JADX INFO: renamed from: a */
    public final void mo3419a() {
        switch (this.f30695e) {
            case 0:
                gx5 gx5Var = this.f30696f.f33967g;
                y42.m12854a0(gx5Var);
                gx5Var.setConditionalUserProperty((Bundle) this.f30697g, this.f20287a);
                break;
            case 1:
                gx5 gx5Var2 = this.f30696f.f33967g;
                y42.m12854a0(gx5Var2);
                gx5Var2.retrieveAndUploadBatches(new k06(this, (oz5) this.f30697g));
                break;
            case 2:
                gx5 gx5Var3 = this.f30696f.f33967g;
                y42.m12854a0(gx5Var3);
                gx5Var3.logHealthData(5, "Error with data collection. Data lost.", v23.m11711K((Exception) this.f30697g), v23.m11711K(null), v23.m11711K(null));
                break;
            default:
                gx5 gx5Var4 = this.f30696f.f33967g;
                y42.m12854a0(gx5Var4);
                gx5Var4.setEventInterceptor((l26) this.f30697g);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz5(x36 x36Var, Exception exc) {
        super(x36Var, false);
        this.f30697g = exc;
        this.f30696f = x36Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz5(x36 x36Var, oz5 oz5Var) {
        super(x36Var, true);
        this.f30697g = oz5Var;
        this.f30696f = x36Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz5(x36 x36Var, l26 l26Var) {
        super(x36Var, true);
        this.f30697g = l26Var;
        Objects.requireNonNull(x36Var);
        this.f30696f = x36Var;
    }
}

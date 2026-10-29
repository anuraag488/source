package p000;

import android.media.session.MediaController;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class pr2 extends of4 implements yp1 {

    /* JADX INFO: renamed from: t */
    public boolean f27913t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ u93 f27914u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ MediaController f27915v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ lr2 f27916w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f27917x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pr2(u93 u93Var, MediaController mediaController, lr2 lr2Var, boolean z, wm0 wm0Var) {
        super(1, wm0Var);
        this.f27914u = u93Var;
        this.f27915v = mediaController;
        this.f27916w = lr2Var;
        this.f27917x = z;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        lr2 lr2Var = this.f27916w;
        boolean z = this.f27917x;
        return new pr2(this.f27914u, this.f27915v, lr2Var, z, (wm0) obj).invokeSuspend(ju4.f22634a);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        MediaController mediaController;
        ap0 ap0Var = ap0.f14763a;
        boolean z = this.f27913t;
        if (!z) {
            k43.m7376J(obj);
            this.f27913t = true;
            obj = this.f27914u.mo11771c(this);
            if (obj == ap0Var) {
                return ap0Var;
            }
        } else {
            if (!z) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k43.m7376J(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ju4 ju4Var = ju4.f22634a;
        if (!zBooleanValue || (mediaController = this.f27915v) == null) {
            return ju4Var;
        }
        int iOrdinal = this.f27916w.ordinal();
        if (iOrdinal == 0) {
            if (this.f27917x) {
                mediaController.getTransportControls().pause();
                return ju4Var;
            }
            mediaController.getTransportControls().play();
            return ju4Var;
        }
        if (iOrdinal == 1) {
            mediaController.getTransportControls().skipToNext();
            return ju4Var;
        }
        if (iOrdinal == 2) {
            mediaController.getTransportControls().skipToPrevious();
            return ju4Var;
        }
        C0670g.m5864c();
        return null;
    }
}

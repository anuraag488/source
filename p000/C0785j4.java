package p000;

import android.hardware.camera2.CameraManager;
import android.media.session.MediaSessionManager;
import java.util.Map;

/* JADX INFO: renamed from: j4 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0785j4 implements t01 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f21993a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f21994b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f21995c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f21996d;

    public /* synthetic */ C0785j4(byte b) {
        this.f21993a = b;
    }

    @Override // p000.t01
    /* JADX INFO: renamed from: a */
    public final void mo4339a() {
        gk2 lifecycle;
        switch (this.f21993a) {
            case 0:
                ((wp1) this.f21994b).invoke();
                ((lk2) this.f21995c).getLifecycle().mo6017c((C0749i4) this.f21996d);
                break;
            case 1:
                w94 w94Var = (w94) this.f21994b;
                Object obj = this.f21995c;
                w94Var.remove(obj);
                ((C0727hj) this.f21996d).f20618d.m8136k(obj);
                break;
            case 2:
                ((CameraManager) this.f21994b).unregisterAvailabilityCallback((uh1) this.f21995c);
                ((sw2) this.f21996d).setValue(Boolean.FALSE);
                break;
            case 3:
                ((CameraManager) this.f21994b).unregisterTorchCallback((vh1) this.f21995c);
                ((sw2) this.f21996d).setValue(Boolean.FALSE);
                break;
            case 4:
                ((lk2) this.f21995c).getLifecycle().mo6017c((hk2) this.f21994b);
                break;
            case 5:
                ((lk2) this.f21995c).getLifecycle().mo6017c((hk2) this.f21994b);
                C0469aw c0469aw = (C0469aw) ((ql3) this.f21996d).f28555a;
                if (c0469aw != null) {
                    c0469aw.m3326a();
                }
                break;
            case 6:
                ((MediaSessionManager) this.f21994b).removeOnActiveSessionsChangedListener((nr2) this.f21995c);
                ((sw2) this.f21996d).setValue(v71.f32439a);
                break;
            case 7:
                lk2 lk2Var = (lk2) this.f21995c;
                if (lk2Var != null && (lifecycle = lk2Var.getLifecycle()) != null) {
                    lifecycle.mo6017c((C0749i4) this.f21994b);
                }
                mh0 mh0Var = (mh0) this.f21996d;
                ek2 ek2Var = ek2.ON_DESTROY;
                mh0Var.getClass();
                mh0Var.f24911b = ek2Var.m5149a();
                mh0Var.m8322a();
                break;
            default:
                iu3 iu3Var = (iu3) this.f21994b;
                lw2 lw2Var = iu3Var.f21806b;
                Object obj2 = this.f21995c;
                Object objM8136k = lw2Var.m8136k(obj2);
                pu3 pu3Var = (pu3) this.f21996d;
                if (objM8136k == pu3Var) {
                    Map map = iu3Var.f21805a;
                    Map mapMo8111c = pu3Var.mo8111c();
                    if (!mapMo8111c.isEmpty()) {
                        map.put(obj2, mapMo8111c);
                    } else {
                        map.remove(obj2);
                    }
                }
                break;
        }
    }
}

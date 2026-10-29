package p000;

import android.view.KeyEvent;

/* JADX INFO: renamed from: yy */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1385yy implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f35608a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f35609b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f35610c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f35611d;

    public /* synthetic */ C1385yy(byte b) {
        this.f35608a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        switch (this.f35608a) {
            case 0:
                KeyEvent keyEvent = ((sc2) obj).f30158a;
                sw2 sw2Var = (sw2) this.f35610c;
                co4 co4Var = (co4) this.f35609b;
                if (!co4Var.m4054b()) {
                    sw2Var.setValue(Boolean.FALSE);
                } else if (qs5.m10083H(keyEvent) == 2 && nc2.m8689a(i20.m6579d(keyEvent.getKeyCode()), nc2.f25667u)) {
                    ((sw2) this.f35611d).setValue(Boolean.FALSE);
                    co4Var.m4053a();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            default:
                pp4 pp4Var = (pp4) obj;
                x11 x11Var = (x11) pp4Var;
                if (!((ViewOnDragListenerC1141sd) ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) sc6.m10653Y((x11) this.f35610c)).m14034getDragAndDropManager()).f30175b.contains(x11Var) || !ev0.m5343R(x11Var, y42.m12866o0((js1) this.f35611d))) {
                    return op4.f26938a;
                }
                ((ql3) this.f35609b).f28555a = pp4Var;
                return op4.f26940c;
        }
    }
}

package p000;

import android.content.ContentResolver;
import android.media.session.MediaController;
import android.view.View;
import essentials.app.EsApp;
import java.util.Map;

/* JADX INFO: renamed from: d4 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0562d4 implements t01 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f16767a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f16768b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f16769c;

    public /* synthetic */ C0562d4(byte b) {
        this.f16767a = b;
    }

    @Override // p000.t01
    /* JADX INFO: renamed from: a */
    public final void mo4339a() throws Exception {
        switch (this.f16767a) {
            case 0:
                ((C1354y3) this.f16768b).f34831d.remove((C0004a3) this.f16769c);
                break;
            case 1:
                ((C1354y3) this.f16768b).f34829b.remove((C1391z3) this.f16769c);
                break;
            case 2:
                ((ContentResolver) this.f16768b).unregisterContentObserver((C1292wg) this.f16769c);
                break;
            case 3:
                ((C1345xv) this.f16768b).m12760b((kh0) this.f16769c);
                break;
            case 4:
                ((he0) this.f16768b).f20510a.remove((wp1) this.f16769c);
                break;
            case 5:
                ((w94) this.f16768b).remove((yp1) this.f16769c);
                break;
            case 6:
                ((xz4) this.f16768b).f34750e.remove((wz4) this.f16769c);
                break;
            case 7:
                ((EsApp) this.f16768b).unregisterComponentCallbacks((oa1) this.f16769c);
                break;
            case 8:
                xn2 xn2Var = (xn2) this.f16768b;
                if (xn2Var != null) {
                    String strM12721a = xn2Var.m12721a();
                    k44 k44Var = k44.f22883b;
                    if (xn2Var.f34459a.m8274a().compareTo(k44Var) <= 0) {
                        xn2Var.m12722b(k44Var, strM12721a, "service stopped", null);
                    }
                }
                ((b23) this.f16769c).f15039b.setValue(null);
                ba3.m3533a();
                break;
            case 9:
                ((i32) this.f16768b).f21094a.m11671k((f32) this.f16769c);
                break;
            case 10:
                ((vi2) this.f16768b).f32646c.m8419k(this.f16769c);
                break;
            case 11:
                ((MediaController) this.f16768b).unregisterCallback((or2) this.f16769c);
                break;
            case 12:
                ((oh0) this.f16768b).m4817f();
                ((kz2) this.f16769c).f23636e = null;
                break;
            case 13:
                ((Map) this.f16768b).remove(((ny2) this.f16769c).f26195b);
                break;
            case 14:
                ((C1345xv) this.f16768b).m12760b((th0) this.f16769c);
                break;
            case 15:
                ((ba4) this.f16768b).remove((kx1) this.f16769c);
                break;
            case 16:
                ((nh4) this.f16768b).getTouchAreas().remove(this.f16769c);
                break;
            case 17:
                ((lh4) this.f16768b).f24036a.remove(((nh4) this.f16769c).f25828q);
                break;
            case 18:
                ((dp4) this.f16768b).f17268k.remove((dp4) this.f16769c);
                break;
            case 19:
                dp4 dp4Var = (dp4) this.f16768b;
                yo4 yo4Var = (yo4) this.f16769c;
                dp4Var.getClass();
                xo4 xo4Var = (xo4) yo4Var.f35430b.getValue();
                if (xo4Var != null) {
                    dp4Var.f17267j.remove(xo4Var.f34508a);
                }
                break;
            case 20:
                ((dp4) this.f16768b).f17267j.remove((bp4) this.f16769c);
                break;
            default:
                y05 y05Var = (y05) this.f16768b;
                View view = (View) this.f16769c;
                int i = y05Var.f34795v - 1;
                y05Var.f34795v = i;
                if (i == 0) {
                    int i2 = cy4.f16619a;
                    yx4.m13270a(view, null);
                    view.setWindowInsetsAnimationCallback(null);
                    view.removeOnAttachStateChangeListener(y05Var.f34796w);
                }
                break;
        }
    }
}

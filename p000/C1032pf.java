package p000;

import android.view.ActionMode;
import essentials.accessibility.EsAccessibilityService;
import java.util.Iterator;
import java.util.Map;
import org.chromium.net.C0995R;

/* JADX INFO: renamed from: pf */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1032pf implements t01 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f27569a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f27570b;

    public /* synthetic */ C1032pf(byte b) {
        this.f27569a = b;
    }

    @Override // p000.t01
    /* JADX INFO: renamed from: a */
    public final void mo4339a() {
        switch (this.f27569a) {
            case 0:
                cd3 cd3Var = (cd3) this.f27570b;
                cd3Var.m10171e();
                cd3Var.setTag(C0995R.id.view_tree_lifecycle_owner, null);
                cd3Var.f15950p.removeViewImmediate(cd3Var);
                break;
            case 1:
                C0651fh c0651fh = (C0651fh) this.f27570b;
                aa4 aa4Var = c0651fh.f18975e;
                C1040pn c1040pn = aa4Var.f217h;
                if (c1040pn != null) {
                    c1040pn.m9573k();
                }
                aa4Var.m155a();
                ActionMode actionMode = c0651fh.f18978h;
                if (actionMode != null) {
                    actionMode.finish();
                }
                c0651fh.f18978h = null;
                break;
            case 2:
                C0668fy c0668fy = (C0668fy) ((C0705gy) this.f27570b).f20182c.getValue();
                if (c0668fy != null) {
                    c0668fy.close();
                }
                break;
            case 3:
                b70 b70Var = ((co4) this.f27570b).f16186c;
                if (b70Var != null) {
                    b70Var.mo115m(null);
                }
                break;
            case 4:
                ((pk4) this.f27570b).m9551m();
                break;
            case 5:
                xn2 xn2Var = ((EsAccessibilityService) this.f27570b).f18446c;
                if (xn2Var != null) {
                    String strM12721a = xn2Var.m12721a();
                    k44 k44Var = k44.f22883b;
                    if (xn2Var.f34459a.m8274a().compareTo(k44Var) <= 0) {
                        xn2Var.m12722b(k44Var, strM12721a, "service stopped", null);
                    }
                }
                break;
            case 6:
                ((C1354y3) this.f27570b).f34828a.setValue(null);
                ba3.m3533a();
                break;
            case 7:
                xn2 xn2Var2 = (xn2) this.f27570b;
                if (xn2Var2 != null) {
                    String strM12721a2 = xn2Var2.m12721a();
                    k44 k44Var2 = k44.f22883b;
                    if (xn2Var2.f34459a.m8274a().compareTo(k44Var2) <= 0) {
                        xn2Var2.m12722b(k44Var2, strM12721a2, "disable feature", null);
                    }
                }
                break;
            case 8:
                ((C0638f5) this.f27570b).m5557J();
                break;
            case 9:
                ((kh2) this.f27570b).f23127d = null;
                break;
            case 10:
                vh2 vh2Var = (vh2) this.f27570b;
                C1126rz c1126rz = vh2Var.f32616c;
                if (c1126rz != null) {
                    c1126rz.f29737a = false;
                }
                vh2Var.f32616c = null;
                break;
            case 11:
                qh2 qh2Var = (qh2) this.f27570b;
                qh2Var.f28474f = true;
                qh2Var.f28472d = 0;
                qh2Var.f28470b.f30273a.remove(qh2Var);
                qh2 qh2Var2 = qh2Var.f28473e;
                if (qh2Var2 != null) {
                    qh2Var2.m9888b();
                }
                qh2Var.f28473e = null;
                break;
            case 12:
                Iterator it = ((Map) this.f27570b).entrySet().iterator();
                while (it.hasNext()) {
                    ((mw3) ((Map.Entry) it.next()).getValue()).mo3937a();
                }
                break;
            case 13:
                C1040pn c1040pn2 = ((aa4) this.f27570b).f217h;
                if (c1040pn2 != null) {
                    c1040pn2.m9573k();
                }
                break;
            case 14:
                ((mh4) this.f27570b).setBackground(null);
                break;
            case 15:
                sw2 sw2Var = (sw2) this.f27570b;
                if (((ff3) sw2Var.getValue()) != null) {
                    sw2Var.setValue(null);
                }
                break;
            default:
                ((yz3) ((zh0) this.f27570b)).m13276D(null);
                break;
        }
    }
}

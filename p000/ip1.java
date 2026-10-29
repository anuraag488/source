package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.lang.invoke.VarHandle;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ip1 implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f21614a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f21615b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f21616c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f21617d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f21618e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f21619f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f21620g;

    public /* synthetic */ ip1(byte b) {
        this.f21614a = b;
    }

    @Override // p000.wp1
    public final Object invoke() {
        int i;
        byte b = this.f21614a;
        byte b2 = 1;
        ju4 ju4Var = ju4.f22634a;
        byte b3 = 0;
        int i2 = 0;
        switch (b) {
            case 0:
                xn2 xn2Var = (xn2) this.f21616c;
                oq1 oq1Var = (oq1) this.f21617d;
                Object obj = this.f21615b;
                Object obj2 = (lp1) this.f21618e;
                sw2 sw2Var = (sw2) this.f21619f;
                pp1 pp1Var = (pp1) this.f21620g;
                if (xn2Var != null) {
                    String strM12721a = xn2Var.m12721a();
                    k44 k44Var = k44.f22883b;
                    if (xn2Var.f34459a.m8274a().compareTo(k44Var) <= 0) {
                        xn2Var.m12722b(k44Var, strM12721a, "show ad", null);
                    }
                }
                Object obj3 = (ag0) sw2Var.getValue();
                jp1 jp1Var = new jp1(b3);
                jp1Var.f22485b = xn2Var;
                jp1Var.f22486c = pp1Var;
                VarHandle.storeStoreFence();
                oq1Var.mo183g(obj, obj3, obj2, jp1Var);
                return ju4Var;
            case 1:
                fu3 fu3Var = (fu3) this.f21616c;
                dv3 dv3Var = (dv3) this.f21617d;
                lu3 lu3Var = (lu3) this.f21618e;
                String str = (String) this.f21619f;
                Object obj4 = this.f21615b;
                Object[] objArr = (Object[]) this.f21620g;
                if (fu3Var.f19322b != lu3Var) {
                    fu3Var.f19322b = lu3Var;
                    b3 = 1;
                }
                if (z62.m13387o(fu3Var.f19323c, str)) {
                    b2 = b3;
                } else {
                    fu3Var.f19323c = str;
                }
                fu3Var.f19321a = dv3Var;
                fu3Var.f19324d = obj4;
                fu3Var.f19325e = objArr;
                ku3 ku3Var = fu3Var.f19326f;
                if (ku3Var != null && b2 != 0) {
                    ((tt2) ku3Var).m11145D();
                    fu3Var.f19326f = null;
                    fu3Var.m5810a();
                }
                return ju4Var;
            default:
                View view = (View) this.f21616c;
                zg4 zg4Var = (zg4) this.f21617d;
                vg4 vg4Var = (vg4) this.f21615b;
                WindowManager windowManager = (WindowManager) this.f21618e;
                C0950nl c0950nl = (C0950nl) this.f21620g;
                sw2 sw2Var2 = (sw2) this.f21619f;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (!(layoutParams instanceof WindowManager.LayoutParams)) {
                    layoutParams = null;
                }
                WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
                if (layoutParams2 == null) {
                    layoutParams2 = new WindowManager.LayoutParams();
                    int iOrdinal = zg4Var.f36067a.ordinal();
                    if (iOrdinal == 0) {
                        i = 2032;
                    } else {
                        if (iOrdinal != 1) {
                            C0670g.m5864c();
                            return null;
                        }
                        i = 2038;
                    }
                    layoutParams2.type = i;
                    layoutParams2.gravity = 51;
                    layoutParams2.format = -3;
                    layoutParams2.layoutInDisplayCutoutMode = 3;
                    layoutParams2.flags = 800;
                    if (c0950nl.f25925f >= 34) {
                        layoutParams2.setCanPlayMoveAnimation(false);
                    }
                }
                d83 d83Var = zg4Var.f36068b;
                d83 d83Var2 = zg4Var.f36069c;
                layoutParams2.width = (int) (((w52) d83Var.getValue()).f33109a >> 32);
                layoutParams2.height = (int) (((w52) zg4Var.f36068b.getValue()).f33109a & 4294967295L);
                layoutParams2.x = (int) (((o52) d83Var2.getValue()).f26352a >> 32);
                layoutParams2.y = (int) (((o52) d83Var2.getValue()).f26352a & 4294967295L);
                layoutParams2.flags = (!((Boolean) zg4Var.f36072f.getValue()).booleanValue() || ((Boolean) zg4Var.f36075i.getValue()).booleanValue()) ? layoutParams2.flags | 16 : layoutParams2.flags & (-17);
                boolean zBooleanValue = ((Boolean) zg4Var.f36073g.getValue()).booleanValue();
                int i3 = layoutParams2.flags;
                layoutParams2.flags = zBooleanValue ? i3 & (-9) : i3 | 8;
                if (((Boolean) sw2Var2.getValue()).booleanValue()) {
                    vg4Var.getClass();
                    windowManager.updateViewLayout(view, layoutParams2);
                    return ju4Var;
                }
                int iM132h = zg4Var.f36070d.m132h();
                List list = (List) eq2.m5273L(zg4Var.f36067a, vg4Var.f32600a);
                windowManager.addView(view, layoutParams2);
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                    } else if (((wg4) it.next()).f33369b <= iM132h) {
                        i2++;
                    }
                }
                int size = i2 < 0 ? list.size() : i2;
                wg4 wg4Var = new wg4();
                wg4Var.f33368a = view;
                wg4Var.f33369b = iM132h;
                VarHandle.storeStoreFence();
                list.add(size, wg4Var);
                if (i2 >= 0) {
                    lb5.m7910S(vg4Var.f32601b, null, null, new ug4(list, iM132h, windowManager, null), 3);
                }
                sw2Var2.setValue(Boolean.TRUE);
                return ju4Var;
        }
    }
}

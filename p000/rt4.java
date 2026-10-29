package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rt4 extends of4 implements oq1 {

    /* JADX INFO: renamed from: t */
    public /* synthetic */ ni2 f29611t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ ni2 f29612u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ yp1 f29613v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ List f29614w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ lv1 f29615x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ sw2 f29616y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ sw2 f29617z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rt4(yp1 yp1Var, List list, lv1 lv1Var, sw2 sw2Var, sw2 sw2Var2, wm0 wm0Var) {
        super(4, wm0Var);
        this.f29613v = yp1Var;
        this.f29614w = list;
        this.f29615x = lv1Var;
        this.f29616y = sw2Var;
        this.f29617z = sw2Var2;
    }

    @Override // p000.oq1
    /* JADX INFO: renamed from: g */
    public final Object mo183g(Object obj, Object obj2, Object obj3, Object obj4) {
        sw2 sw2Var = this.f29616y;
        sw2 sw2Var2 = this.f29617z;
        rt4 rt4Var = new rt4(this.f29613v, this.f29614w, this.f29615x, sw2Var, sw2Var2, (wm0) obj4);
        rt4Var.f29611t = (ni2) obj2;
        rt4Var.f29612u = (ni2) obj3;
        ju4 ju4Var = ju4.f22634a;
        rt4Var.invokeSuspend(ju4Var);
        return ju4Var;
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        int i;
        sw2 sw2Var;
        ni2 ni2Var = this.f29611t;
        ni2 ni2Var2 = this.f29612u;
        ap0 ap0Var = ap0.f14763a;
        k43.m7376J(obj);
        sw2 sw2Var2 = this.f29616y;
        Iterator it = ((List) sw2Var2.getValue()).iterator();
        int i2 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            i = -1;
            sw2Var = this.f29617z;
            if (!zHasNext) {
                i2 = -1;
                break;
            }
            if (z62.m13387o(((yp1) sw2Var.getValue()).invoke(it.next()), ni2Var.f25855j)) {
                break;
            }
            i2++;
        }
        Iterator it2 = ((List) sw2Var2.getValue()).iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            if (z62.m13387o(((yp1) sw2Var.getValue()).invoke(it2.next()), ni2Var2.f25855j)) {
                i = i3;
                break;
            }
            i3++;
        }
        ArrayList arrayList = new ArrayList(this.f29614w);
        arrayList.add(i, arrayList.remove(i2));
        this.f29613v.invoke(arrayList);
        lv1 lv1Var = this.f29615x;
        if (lv1Var != null) {
            lv1Var.m8115a(new dv1(d55.m4371p(0.5f, 7, 0), nv1.m8857b()));
        }
        return ju4.f22634a;
    }
}

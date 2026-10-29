package p000;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class vp5 extends dp5 {

    /* JADX INFO: renamed from: c */
    public ArrayList f32785c;

    /* JADX INFO: renamed from: d */
    public ArrayList f32786d;

    /* JADX INFO: renamed from: e */
    public r36 f32787e;

    @Override // p000.dp5
    /* JADX INFO: renamed from: f */
    public final aq5 mo4517f(r36 r36Var, List list) {
        vq5 vq5Var;
        r36 r36VarM10196g = this.f32787e.m10196g();
        yg3 yg3Var = (yg3) r36VarM10196g.f28986b;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f32785c;
            int size = arrayList.size();
            vq5Var = aq5.f14781np;
            if (i2 >= size) {
                break;
            }
            if (i2 < list.size()) {
                r36VarM10196g.m10199k((String) arrayList.get(i2), ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) list.get(i2)));
            } else {
                r36VarM10196g.m10199k((String) arrayList.get(i2), vq5Var);
            }
            i2++;
        }
        ArrayList arrayList2 = this.f32786d;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj = arrayList2.get(i);
            i++;
            aq5 aq5Var = (aq5) obj;
            aq5 aq5VarM13122t = yg3Var.m13122t(r36VarM10196g, aq5Var);
            if (aq5VarM13122t instanceof dq5) {
                aq5VarM13122t = yg3Var.m13122t(r36VarM10196g, aq5Var);
            }
            if (aq5VarM13122t instanceof po5) {
                return ((po5) aq5VarM13122t).f27868a;
            }
        }
        return vq5Var;
    }

    @Override // p000.dp5, p000.aq5
    /* JADX INFO: renamed from: r */
    public final aq5 mo3121r() {
        vp5 vp5Var = new vp5(this.f17271a);
        ArrayList arrayList = this.f32785c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        vp5Var.f32785c = arrayList2;
        arrayList2.addAll(arrayList);
        ArrayList arrayList3 = this.f32786d;
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        vp5Var.f32786d = arrayList4;
        arrayList4.addAll(arrayList3);
        vp5Var.f32787e = this.f32787e;
        VarHandle.storeStoreFence();
        return vp5Var;
    }
}

package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class eq6 extends dp5 {

    /* JADX INFO: renamed from: c */
    public final boolean f18380c;

    /* JADX INFO: renamed from: d */
    public final boolean f18381d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ee6 f18382e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq6(ee6 ee6Var, boolean z, boolean z2) {
        super("log");
        this.f18382e = ee6Var;
        this.f18380c = z;
        this.f18381d = z2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0081  */
    /* JADX WARN: Code duplicated, block: B:22:0x0092  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a1 A[LOOP:0: B:23:0x0097->B:25:0x00a1, LOOP_END] */
    @Override // p000.dp5
    /* JADX INFO: renamed from: f */
    public final aq5 mo4517f(r36 r36Var, List list) {
        int i;
        int i2;
        String strMo3117h;
        ArrayList arrayList;
        w76.m12156c("log", 1, list);
        int size = list.size();
        vq5 vq5Var = aq5.f14781np;
        ee6 ee6Var = this.f18382e;
        if (size == 1) {
            ((bt5) ee6Var.f18038d).m3677d(3, ((yg3) r36Var.f28986b).m13122t(r36Var, (aq5) list.get(0)).mo3117h(), Collections.EMPTY_LIST, this.f18380c, this.f18381d);
            return vq5Var;
        }
        aq5 aq5Var = (aq5) list.get(0);
        yg3 yg3Var = (yg3) r36Var.f28986b;
        yg3 yg3Var2 = (yg3) r36Var.f28986b;
        int iM12162i = w76.m12162i(yg3Var.m13122t(r36Var, aq5Var).mo3119m().doubleValue());
        if (iM12162i != 2) {
            i = 3;
            if (iM12162i == 3) {
                i2 = 1;
            } else if (iM12162i == 5) {
                i2 = 5;
            } else if (iM12162i == 6) {
                i2 = 2;
            }
            strMo3117h = yg3Var2.m13122t(r36Var, (aq5) list.get(1)).mo3117h();
            if (list.size() == 2) {
                ((bt5) ee6Var.f18038d).m3677d(i2, strMo3117h, Collections.EMPTY_LIST, this.f18380c, this.f18381d);
                return vq5Var;
            }
            arrayList = new ArrayList();
            for (int i3 = 2; i3 < Math.min(list.size(), 5); i3++) {
                arrayList.add(yg3Var2.m13122t(r36Var, (aq5) list.get(i3)).mo3117h());
            }
            ((bt5) ee6Var.f18038d).m3677d(i2, strMo3117h, arrayList, this.f18380c, this.f18381d);
            return vq5Var;
        }
        i = 4;
        i2 = i;
        strMo3117h = yg3Var2.m13122t(r36Var, (aq5) list.get(1)).mo3117h();
        if (list.size() == 2) {
            ((bt5) ee6Var.f18038d).m3677d(i2, strMo3117h, Collections.EMPTY_LIST, this.f18380c, this.f18381d);
            return vq5Var;
        }
        arrayList = new ArrayList();
        while (i3 < Math.min(list.size(), 5)) {
            arrayList.add(yg3Var2.m13122t(r36Var, (aq5) list.get(i3)).mo3117h());
        }
        ((bt5) ee6Var.f18038d).m3677d(i2, strMo3117h, arrayList, this.f18380c, this.f18381d);
        return vq5Var;
    }
}

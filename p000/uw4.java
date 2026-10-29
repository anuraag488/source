package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class uw4 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f32218a = 0;

    static {
        int i = pb0.f27502i;
    }

    /* JADX INFO: renamed from: a */
    public static final List m11675a(String str) {
        nh3 nh3Var = new nh3((byte) 27);
        ArrayList arrayList = (ArrayList) nh3Var.f25810b;
        if (arrayList == null) {
            arrayList = new ArrayList();
            nh3Var.f25810b = arrayList;
        } else {
            arrayList.clear();
        }
        nh3Var.m8742I(str, arrayList);
        ArrayList arrayList2 = (ArrayList) nh3Var.f25810b;
        return arrayList2 != null ? arrayList2 : v71.f32439a;
    }
}

package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ym5 {

    /* JADX INFO: renamed from: a */
    public ArrayList f35337a;

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m13175a(int i) {
        ArrayList arrayList = this.f35337a;
        if (arrayList.size() >= 256) {
            return false;
        }
        arrayList.add(Integer.valueOf(i));
        return true;
    }
}

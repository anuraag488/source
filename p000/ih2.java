package p000;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ih2 implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f21419a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ C0795je f21420b;

    public /* synthetic */ ih2(byte b) {
        this.f21419a = b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f21419a) {
            case 0:
                C0795je c0795je = this.f21420b;
                return Integer.valueOf(c0795je.m7080e(((ni2) obj).f25855j)).compareTo(Integer.valueOf(c0795je.m7080e(((ni2) obj2).f25855j)));
            case 1:
                C0795je c0795je2 = this.f21420b;
                return Integer.valueOf(c0795je2.m7080e(((ni2) obj).f25855j)).compareTo(Integer.valueOf(c0795je2.m7080e(((ni2) obj2).f25855j)));
            case 2:
                C0795je c0795je3 = this.f21420b;
                return Integer.valueOf(c0795je3.m7080e(((ni2) obj2).f25855j)).compareTo(Integer.valueOf(c0795je3.m7080e(((ni2) obj).f25855j)));
            default:
                C0795je c0795je4 = this.f21420b;
                return Integer.valueOf(c0795je4.m7080e(((ni2) obj2).f25855j)).compareTo(Integer.valueOf(c0795je4.m7080e(((ni2) obj).f25855j)));
        }
    }
}

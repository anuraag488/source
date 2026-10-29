package p000;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class uc1 implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f31780a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f31781b;

    public /* synthetic */ uc1(byte b) {
        this.f31780a = b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f31780a) {
            case 0:
                o04 o04Var = (o04) this.f31781b;
                return ((Comparable) o04Var.invoke(obj)).compareTo((Comparable) o04Var.invoke(obj2));
            case 1:
                xv2 xv2Var = (xv2) this.f31781b;
                return Float.valueOf(xv2Var.m12764c(((Map.Entry) obj2).getKey())).compareTo(Float.valueOf(xv2Var.m12764c(((Map.Entry) obj).getKey())));
            case 2:
                pz2 pz2Var = (pz2) this.f31781b;
                return Integer.valueOf(pz2Var.m9689a().indexOf(((l73) obj).f23833a)).compareTo(Integer.valueOf(pz2Var.m9689a().indexOf(((l73) obj2).f23833a)));
            case 3:
                int iCompare = ((Comparator) this.f31781b).compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                wf2 wf2Var = ((i14) obj).f21011c;
                wf2 wf2Var2 = ((i14) obj2).f21011c;
                return wf2Var.m12298y() == wf2Var2.m12298y() ? z62.m13393u(wf2Var.m12296w(), wf2Var2.m12296w()) : Float.compare(wf2Var.m12298y(), wf2Var2.m12298y());
            case 4:
                int iCompare2 = ((uc1) this.f31781b).compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : Integer.valueOf(((i14) obj).f21014f).compareTo(Integer.valueOf(((i14) obj2).f21014f));
            default:
                ui4 ui4Var = (ui4) this.f31781b;
                return qs5.m10111p((Comparable) ((HashMap) ui4Var.m11564d()).get((rv1) obj), (Comparable) ((HashMap) ui4Var.m11564d()).get((rv1) obj2));
        }
    }
}

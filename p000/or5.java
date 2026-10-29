package p000;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class or5 implements Comparator {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ dp5 f26995a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ r36 f26996b;

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        aq5 aq5Var = (aq5) obj;
        aq5 aq5Var2 = (aq5) obj2;
        if (aq5Var instanceof vq5) {
            return !(aq5Var2 instanceof vq5) ? 1 : 0;
        }
        if (aq5Var2 instanceof vq5) {
            return -1;
        }
        dp5 dp5Var = this.f26995a;
        return dp5Var == null ? aq5Var.mo3117h().compareTo(aq5Var2.mo3117h()) : (int) w76.m12163j(dp5Var.mo4517f(this.f26996b, Arrays.asList(aq5Var, aq5Var2)).mo3119m().doubleValue());
    }
}

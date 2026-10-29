package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class hl3 implements xu3 {

    /* JADX INFO: renamed from: a */
    public LinkedHashSet f20673a;

    @Override // p000.xu3
    /* JADX INFO: renamed from: a */
    public final Bundle mo6427a() {
        Bundle bundleM7742x = kx5.m7742x((l73[]) Arrays.copyOf(new l73[0], 0));
        List listM6319e1 = hb0.m6319e1(this.f20673a);
        bundleM7742x.putStringArrayList("classes_to_restore", listM6319e1 instanceof ArrayList ? (ArrayList) listM6319e1 : new ArrayList<>(listM6319e1));
        return bundleM7742x;
    }
}

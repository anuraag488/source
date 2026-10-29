package p000;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class uu3 implements xu3 {

    /* JADX INFO: renamed from: a */
    public yu3 f32187a;

    /* JADX INFO: renamed from: b */
    public boolean f32188b;

    /* JADX INFO: renamed from: c */
    public Bundle f32189c;

    /* JADX INFO: renamed from: d */
    public dg4 f32190d;

    @Override // p000.xu3
    /* JADX INFO: renamed from: a */
    public final Bundle mo6427a() {
        Bundle bundleM7742x = kx5.m7742x((l73[]) Arrays.copyOf(new l73[0], 0));
        Bundle bundle = this.f32189c;
        if (bundle != null) {
            bundleM7742x.putAll(bundle);
        }
        for (Map.Entry entry : ((vu3) this.f32190d.getValue()).f32880b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleMo6427a = ((vf0) ((qu3) entry.getValue()).f28818a.f29655f).mo6427a();
            if (!bundleMo6427a.isEmpty()) {
                bundleM7742x.putBundle(str, bundleMo6427a);
            }
        }
        this.f32188b = false;
        return bundleM7742x;
    }

    /* JADX INFO: renamed from: b */
    public final void m11649b() {
        if (this.f32188b) {
            return;
        }
        Bundle bundleM13253a = this.f32187a.m13253a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleM7742x = kx5.m7742x((l73[]) Arrays.copyOf(new l73[0], 0));
        Bundle bundle = this.f32189c;
        if (bundle != null) {
            bundleM7742x.putAll(bundle);
        }
        if (bundleM13253a != null) {
            bundleM7742x.putAll(bundleM13253a);
        }
        this.f32189c = bundleM7742x;
        this.f32188b = true;
    }
}

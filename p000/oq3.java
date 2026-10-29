package p000;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class oq3 {

    /* JADX INFO: renamed from: a */
    public ArrayList f26963a;

    /* JADX INFO: renamed from: b */
    public short f26964b;

    /* JADX INFO: renamed from: a */
    public final synchronized List m9236a() {
        return Collections.unmodifiableList(new ArrayList(this.f26963a));
    }

    /* JADX INFO: renamed from: b */
    public final synchronized boolean m9237b(List list) {
        this.f26963a.clear();
        if (list.size() <= this.f26964b) {
            return this.f26963a.addAll(list);
        }
        Log.w("FirebaseCrashlytics", "Ignored 0 entries when adding rollout assignments. Maximum allowable: " + ((int) this.f26964b), null);
        return this.f26963a.addAll(list.subList(0, this.f26964b));
    }
}

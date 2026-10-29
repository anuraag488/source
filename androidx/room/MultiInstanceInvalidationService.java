package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
import p000.wu2;
import p000.xu2;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: a */
    public int f14675a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f14676b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public final xu2 f14677c = new xu2(this);

    /* JADX INFO: renamed from: d */
    public final wu2 f14678d = new wu2(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f14678d;
    }
}

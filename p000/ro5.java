package p000;

import android.os.Bundle;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ro5 implements Runnable {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ lo5 f29479a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ String f29480b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ vt5 f29481c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ int f29482d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ String f29483e;

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentHashMap concurrentHashMap = this.f29479a.f24236l.f33585c;
        String str = this.f29480b;
        vt5 vt5Var = this.f29481c;
        if (concurrentHashMap.remove(str, vt5Var)) {
            String str2 = this.f29483e;
            int i = this.f29482d;
            Bundle bundle = new Bundle();
            bundle.putString("targetPackage", str);
            bundle.putInt("errorCode", i);
            bundle.putString("errorMessage", str2);
            vt5Var.f32870b.onError(bundle);
        }
    }
}

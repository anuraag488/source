package p000;

import ads_mobile_sdk.cr3;
import ads_mobile_sdk.el3;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s75 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f29948a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ el3 f29949b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ HashMap f29950c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Context f29951d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ View f29952e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Activity f29953f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ String f29954g;

    public /* synthetic */ s75(byte b) {
        this.f29948a = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f29948a) {
            case 0:
                el3 el3Var = this.f29949b;
                HashMap map = this.f29950c;
                Context context = this.f29951d;
                View view = this.f29952e;
                Activity activity = this.f29953f;
                String str = this.f29954g;
                cr3 cr3Var = el3Var.f3094g;
                cr3Var.getClass();
                HashMap map2 = new HashMap();
                Iterator it = cr3Var.f2249a.iterator();
                while (it.hasNext()) {
                    ((xj5) it.next()).mo217b(map2);
                }
                map.putAll(map2);
                el3Var.m833a(map);
                map.put("f", "c");
                map.put("ctx", context);
                map.put("view", view);
                map.put("act", activity);
                map.put("bds", str);
                break;
            default:
                el3 el3Var2 = this.f29949b;
                HashMap map3 = this.f29950c;
                Context context2 = this.f29951d;
                View view2 = this.f29952e;
                Activity activity2 = this.f29953f;
                String str2 = this.f29954g;
                cr3 cr3Var2 = el3Var2.f3094g;
                cr3Var2.getClass();
                HashMap map4 = new HashMap();
                Iterator it2 = cr3Var2.f2249a.iterator();
                while (it2.hasNext()) {
                    ((xj5) it2.next()).mo216a(map4, context2, view2);
                }
                map3.putAll(map4);
                el3Var2.m833a(map3);
                map3.put("f", "v");
                map3.put("ctx", context2);
                map3.put("view", view2);
                map3.put("act", activity2);
                map3.put("bds", str2);
                break;
        }
    }
}

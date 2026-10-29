package p000;

import ads_mobile_sdk.cl0;
import ads_mobile_sdk.ll0;
import ads_mobile_sdk.p31;
import ads_mobile_sdk.sy3;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wb5 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f33221a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f33222b;

    public /* synthetic */ wb5(byte b) {
        this.f33221a = b;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.f33221a;
        wm0 wm0Var = null;
        Object obj = this.f33222b;
        switch (b) {
            case 0:
                ((ll0) obj).f6871k.set(false);
                return;
            case 1:
                ll0 ll0Var = (ll0) obj;
                p31 p31Var = ll0Var.f6867g;
                Intent intent = new Intent("android.intent.action.VIEW", ll0.f6860q);
                Bundle bundle = new Bundle();
                bundle.putBinder("android.support.customtabs.extra.SESSION", null);
                String str = ll0Var.f6876p;
                if (str == null) {
                    z62.m13366Y("packageName");
                    throw null;
                }
                bundle.putString("com.android.browser.application_id", str);
                intent.putExtras(bundle);
                p31Var.m1916a(intent);
                return;
            case 2:
                ll0 ll0Var2 = (ll0) obj;
                sy3.m2303a(ll0Var2.f6862b, (t82) null, new cl0(ll0Var2, wm0Var, (byte) 8), 3);
                return;
            case 3:
                ((ll0) obj).f6871k.set(false);
                return;
            default:
                ((AtomicInteger) obj).set(i);
                return;
        }
    }
}

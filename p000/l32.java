package p000;

import android.os.Bundle;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class l32 {

    /* JADX INFO: renamed from: a */
    public String f23761a;

    /* JADX INFO: renamed from: b */
    public go3 f23762b;

    /* JADX INFO: renamed from: c */
    public Bundle f23763c = new Bundle();

    public l32(String str) {
        this.f23761a = str;
        eo3 eo3Var = eo3.f18333a;
        fo3 fo3Var = fo3.f19180a;
        co3 co3Var = co3.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        ArrayList arrayListM7730r = kx5.m7730r("B3EEABB8EE11C2BE770B684D95219ECB");
        do3 do3Var = do3.f17237b;
        go3 go3Var = new go3();
        go3Var.f19991a = co3Var;
        go3Var.f19992b = arrayListM7730r;
        go3Var.f19993c = do3Var;
        VarHandle.storeStoreFence();
        this.f23762b = go3Var;
    }

    /* JADX INFO: renamed from: a */
    public l32 m7824a() {
        String str = this.f23761a;
        go3 go3Var = this.f23762b;
        Bundle bundle = this.f23763c;
        l32 l32Var = new l32();
        l32Var.f23761a = str;
        l32Var.f23762b = go3Var;
        l32Var.f23763c = bundle;
        VarHandle.storeStoreFence();
        return l32Var;
    }
}

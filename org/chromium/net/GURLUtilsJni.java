package org.chromium.net;

import internal.p002J.AbstractC0768N;
import java.util.ArrayList;
import p000.wm5;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class GURLUtilsJni implements GURLUtils.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static wm5 sOverride;

    public static GURLUtils.Natives get() {
        GURLUtils.Natives natives;
        wm5 wm5Var = sOverride;
        return (wm5Var == null || (natives = wm5Var.f33508a) == null) ? new GURLUtilsJni() : natives;
    }

    public static void setInstanceForTesting(GURLUtils.Natives natives) {
        wm5 wm5Var;
        wm5 wm5Var2 = sOverride;
        if (wm5Var2 == null) {
            synchronized (wm5.class) {
                try {
                    ArrayList arrayList = wm5.f33507b;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        wm5.f33507b = arrayList;
                    }
                    wm5Var = new wm5();
                    arrayList.add(wm5Var);
                } catch (Throwable th) {
                    throw th;
                }
            }
            sOverride = wm5Var;
            wm5Var2 = wm5Var;
        }
        wm5Var2.f33508a = natives;
    }

    @Override // org.chromium.net.GURLUtils.Natives
    public String getOrigin(String str) {
        return (String) AbstractC0768N.MpCt7siL(str);
    }
}

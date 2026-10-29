package p000;

import ads_mobile_sdk.AbstractC0137h;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: cx */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0554cx {

    /* JADX INFO: renamed from: a */
    public final String f16552a;

    /* JADX INFO: renamed from: c */
    public String f16554c;

    /* JADX INFO: renamed from: i */
    public String f16560i;

    /* JADX INFO: renamed from: b */
    public final LinkedHashSet f16553b = new LinkedHashSet();

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f16555d = new LinkedHashMap();

    /* JADX INFO: renamed from: e */
    public Bundle f16556e = new Bundle();

    /* JADX INFO: renamed from: f */
    public final HashSet f16557f = new HashSet();

    /* JADX INFO: renamed from: g */
    public final HashSet f16558g = new HashSet();

    /* JADX INFO: renamed from: h */
    public final LinkedHashMap f16559h = new LinkedHashMap();

    public AbstractC0554cx(String str) {
        this.f16552a = str;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0554cx m4226b(Set set) {
        HashSet hashSet = this.f16558g;
        hashSet.clear();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.length() == 0) {
                AbstractC0137h.m1115c("Neighboring content URL should not be empty.", null);
            } else {
                hashSet.add(str);
            }
        }
        return mo4225a();
    }

    /* JADX INFO: renamed from: a */
    public AbstractC0554cx mo4225a() {
        return this;
    }
}

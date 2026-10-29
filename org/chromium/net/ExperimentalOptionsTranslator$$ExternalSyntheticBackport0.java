package org.chromium.net;

import java.util.Iterator;
import p000.xy4;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExperimentalOptionsTranslator$$ExternalSyntheticBackport0 {
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ String m9246m(CharSequence charSequence, Iterable iterable) {
        if (charSequence == null) {
            xy4.m12782k("delimiter");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append(charSequence);
            }
        }
        return sb.toString();
    }
}

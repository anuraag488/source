package p000;

import android.icu.text.IDNA;
import java.net.IDN;
import java.util.Iterator;
import java.util.StringJoiner;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class mz1 {

    /* JADX INFO: renamed from: a */
    public static final IDNA f25341a;

    static {
        IDNA uTS46Instance = IDNA.getUTS46Instance(48);
        if (uTS46Instance != null) {
            f25341a = uTS46Instance;
        } else {
            C1077qn.m9989o("Failed to create IDNA instance");
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m8458a(String str) {
        IDNA idna = f25341a;
        if (idna == null) {
            return IDN.toASCII(str, 2);
        }
        StringBuilder sb = new StringBuilder();
        IDNA.Info info = new IDNA.Info();
        idna.nameToASCII(str, sb, info);
        if (!info.hasErrors()) {
            String string = sb.toString();
            IDN.toASCII(string, 2);
            return string;
        }
        StringJoiner stringJoiner = new StringJoiner(", ");
        Iterator<IDNA.Error> it = info.getErrors().iterator();
        while (it.hasNext()) {
            stringJoiner.add(it.next().toString());
        }
        C1077qn.m9987m("Failed to convert IDN to ASCII: ".concat(stringJoiner.toString()));
        return null;
    }
}

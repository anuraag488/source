package p000;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class za0 extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za0(long j, long j2, int i, IndexOutOfBoundsException indexOutOfBoundsException, byte b) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat("Pos: " + j + ", limit: " + j2 + ", len: " + i), indexOutOfBoundsException);
        switch (b) {
            case 4:
                Locale locale = Locale.US;
                super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat("Pos: " + j + ", limit: " + j2 + ", len: " + i), indexOutOfBoundsException);
                break;
            case 5:
            default:
                Locale locale2 = Locale.US;
                break;
            case 6:
                Locale locale3 = Locale.US;
                super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat("Pos: " + j + ", limit: " + j2 + ", len: " + i), indexOutOfBoundsException);
                break;
        }
    }

    public /* synthetic */ za0(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    public za0(int i, int i2, int i3, IndexOutOfBoundsException indexOutOfBoundsException, byte b) {
        switch (b) {
            case 2:
                Locale locale = Locale.US;
                StringBuilder sb = new StringBuilder("Pos: ");
                sb.append(i);
                sb.append(", limit: ");
                sb.append(i2);
                sb.append(", len: ");
                sb.append(i3);
                super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sb.toString()), indexOutOfBoundsException);
                break;
            default:
                Locale locale2 = Locale.US;
                StringBuilder sb2 = new StringBuilder("Pos: ");
                sb2.append(i);
                sb2.append(", limit: ");
                sb2.append(i2);
                sb2.append(", len: ");
                sb2.append(i3);
                super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sb2.toString()), indexOutOfBoundsException);
                break;
        }
    }
}

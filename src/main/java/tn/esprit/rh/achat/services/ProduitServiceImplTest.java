package tn.esprit.rh.achat.services;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import tn.esprit.rh.achat.repositories.ProduitRepository;

@ExtendWith(MockitoExtension.class)
public class ProduitServiceImplTest {
    @InjectMocks
    ProduitServiceImpl produitService;

    @Mock
    ProduitRepository produitRepository;
}
